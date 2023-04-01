package telusmikolaj;

public class BubbleSort {

    public void sort(Vector vector, Counter counter) {
        int n = vector.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    swap(vector, j, j + 1);
                    swapped = true;
                    counter.incrementIfCounter();
                }
                counter.incrementLoopCounter();
            }

            if (!swapped) {
                break;
            }
            counter.incrementLoopCounter();
        }
    }
    private void swap(Vector vector, int i, int j) {
        int temp = vector.get(i);
        vector.set(i, vector.get(j));
        vector.set(j, temp);
    }
}
