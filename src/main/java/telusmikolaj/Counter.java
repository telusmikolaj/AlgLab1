package telusmikolaj;

public class Counter {

    private long loopCounter;
    private long ifCounter;

    public Counter() {
        this.loopCounter = 0;
        this.ifCounter = 0;
    }

    public void incrementLoopCounter() {
        loopCounter++;
    }

    public void incrementIfCounter() {
        ifCounter++;
    }

   public void resetCounter() {
        loopCounter = 0;
        ifCounter = 0;
    }
    public void printCounterResult(String algorithmName, int vectorSize) {
        System.out.println("Algorithm: " + algorithmName + " Vector size: " + vectorSize);
        System.out.println("    Loop counter: " + loopCounter);
        System.out.println( "    If counter: " + ifCounter);
        System.out.println();
    }
}
