package telusmikolaj;

public class DoubleBubbleSort {

    public void sort(Vector vector, Counter counter) {
        int n = vector.size();

        for (int i = 0; i < n - 1; i += 2) {
            int j = i + 1;

            if (vector.get(i) > vector.get(j)) {
                swap(vector, i, j);
                counter.incrementIfCounter();
            }

            int smallerBubbleIndex = vector.get(i) < vector.get(j) ? i : j;
            int largerBubbleIndex = vector.get(i) < vector.get(j) ? j : i;

            while (smallerBubbleIndex > 0) {
                int prevElement = vector.get(smallerBubbleIndex - 1);
                int currentElement = vector.get(smallerBubbleIndex);
                if (prevElement > currentElement) {
                    swap(vector, smallerBubbleIndex, smallerBubbleIndex - 1);
                    counter.incrementIfCounter();
                }
                smallerBubbleIndex--;
                counter.incrementLoopCounter();
            }

            while (largerBubbleIndex < n - 1) {
                int nextElement = vector.get(largerBubbleIndex + 1);
                int currentElement = vector.get(largerBubbleIndex);
                if (currentElement > nextElement) {
                    swap(vector, largerBubbleIndex, largerBubbleIndex + 1);
                    counter.incrementIfCounter();
                }
                largerBubbleIndex++;
                counter.incrementLoopCounter();
            }
        }
        counter.incrementLoopCounter();
    }
    private void swap(Vector vector, int i, int j) {
        int temp = vector.get(i);
        vector.set(i, vector.get(j));
        vector.set(j, temp);
    }
}
