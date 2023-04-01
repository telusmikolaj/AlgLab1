package telusmikolaj;

public class BadPivotQuickSort {

    public void sort(Vector vector, int low, int high, Counter counter) {
        if (low < high) {
            int pivotIndex = partition(vector, low, high, counter);

            sort(vector, low, pivotIndex - 1, counter);
            sort(vector, pivotIndex + 1, high, counter);

            counter.incrementIfCounter();
        }
    }

    private int partition(Vector vector, int low, int high, Counter counter) {

        int pivot = vector.get(low);
        int i = low + 1;

        for (int j = low + 1; j <= high; j++) {
            if (vector.get(j) < pivot) {
                swap(vector, i, j);
                counter.incrementIfCounter();
                i++;
            }
            counter.incrementLoopCounter();
        }

        swap(vector, low, i - 1);
        return i - 1;
    }

    private void swap(Vector vector, int i, int j) {
        int temp = vector.get(i);
        vector.set(i, vector.get(j));
        vector.set(j, temp);
    }
}
