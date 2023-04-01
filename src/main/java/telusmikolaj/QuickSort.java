package telusmikolaj;

import java.util.Random;

public class QuickSort {

    private final Random random = new Random();

    public void sort(Vector vector, int low, int high, Counter counter) {
        if (low < high) {
            int pivotIndex = randomizedPartition(vector, low, high, counter);

            sort(vector, low, pivotIndex - 1, counter);
            sort(vector, pivotIndex + 1, high, counter);

            counter.incrementIfCounter();
        }
    }

    private int randomizedPartition(Vector vector, int low, int high, Counter counter) {
        int randomIndex = random.nextInt(high - low + 1) + low;
        swap(vector, randomIndex, high);
        return partition(vector, low, high, counter);
    }

    private int partition(Vector vector, int low, int high, Counter counter) {
        int pivot = vector.get(high);
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (vector.get(j) < pivot) {
                i++;
                swap(vector, i, j);
                counter.incrementIfCounter();
            }
            counter.incrementLoopCounter();
        }

        swap(vector, i + 1, high);
        return i + 1;
    }

    private void swap(Vector vector, int i, int j) {
        int temp = vector.get(i);
        vector.set(i, vector.get(j));
        vector.set(j, temp);
    }
}
