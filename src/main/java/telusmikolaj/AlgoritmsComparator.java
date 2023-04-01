package telusmikolaj;

import java.util.List;

public class AlgoritmsComparator {
    private final QuickSort qs = new QuickSort();

    private final BadPivotQuickSort bpqs = new BadPivotQuickSort();

    private final DoubleBubbleSort dbs = new DoubleBubbleSort();

    private final BubbleSort bs = new BubbleSort();
    private final Counter counter = new Counter();

    private final VectorFactory vectorFactory = new VectorFactory();


    public void compareAlgoritms() {
        List<Vector> qsAvgVectors = vectorFactory.getAvgVectors(10, 20);
        quickSortAndPrintResult(qsAvgVectors, "QuickSort Avg Case");

        List<Vector> qsBestVectors = vectorFactory.getBestVectors(10, 20);
        quickSortAndPrintResult(qsBestVectors, "QuickSort Best Case");

        List<Vector> qsWorstVectors = vectorFactory.getWorstVectors(10, 20);
        List<Vector> qsWorstVectorsReverse = vectorFactory.getBestVectors(10, 20);
        badQuickSortAndPrintResult(qsWorstVectors, "QuickSort Worst Case");
        badQuickSortAndPrintResult(qsWorstVectorsReverse, "QuickSort Worst Case Reverse");


        List<Vector> bsBestVectors = vectorFactory.getBestVectors(10, 20);
        bubbleSortAndPrintResult(bsBestVectors, "BubbleSort Best Case");

        List<Vector> bsAvgVectors = vectorFactory.getAvgVectors(10, 20);
        bubbleSortAndPrintResult(bsAvgVectors, "BubbleSort Avg Case");

        List<Vector> bsWorstVectors = vectorFactory.getWorstVectors(10, 20);
        bubbleSortAndPrintResult(bsWorstVectors, "BubbleSort Worst Case");


        List<Vector> dbsBestVectors = vectorFactory.getBestVectors(10, 20);
        doubleBubbleSortAndPrintResult(dbsBestVectors, "DoubleBubbleSort Best Case");

        List<Vector> dbsAvgVectors = vectorFactory.getAvgVectors(10, 20);
        doubleBubbleSortAndPrintResult(dbsAvgVectors, "DoubleBubbleSort Avg Case");


        List<Vector> dbsWorstVectors = vectorFactory.getWorstVectors(10, 20);
        doubleBubbleSortAndPrintResult(dbsWorstVectors, "DoubleBubbleSort Worst Case");


    }


    public void bubbleSortAndPrintResult(List<Vector> vectorList, String title) {
        for (Vector vector : vectorList) {
            bs.sort(vector, counter);
            counter.printCounterResult(title, vector.size());
            counter.resetCounter();
        }
    }

    public void doubleBubbleSortAndPrintResult(List<Vector> vectorList, String title) {
        for (Vector vector : vectorList) {
            dbs.sort(vector, counter);
            counter.printCounterResult(title, vector.size());
            counter.resetCounter();
        }
    }

    public void quickSortAndPrintResult(List<Vector> vectorList, String title) {
        for (Vector vector : vectorList) {
            qs.sort(vector, 0, vector.size() - 1, counter);
            counter.printCounterResult(title, vector.size());
            counter.resetCounter();
        }
    }

    public void badQuickSortAndPrintResult(List<Vector> vectorList, String title) {
        for (Vector vector : vectorList) {
            bpqs.sort(vector, 0, vector.size() - 1, counter);
            counter.printCounterResult(title, vector.size());
            counter.resetCounter();
        }
    }

    public void printVector(Vector vector) {
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }


}
