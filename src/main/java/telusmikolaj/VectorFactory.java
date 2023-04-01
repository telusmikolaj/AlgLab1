package telusmikolaj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VectorFactory {

    public List<Vector> getAvgVectors(int minPowRange, int maxPowRange) {
        List<Vector> vectorList = new ArrayList<>();
        for(int i = minPowRange; i <= maxPowRange; i++) {
            vectorList.add(getRandomVectorPowerOfTwoSize(i));
        }
        return vectorList;
    }

    public List<Vector> getBestVectors(int minPowRange, int maxPowRange) {
        List<Vector> vectorList = new ArrayList<>();
        for(int i = minPowRange; i <= maxPowRange; i++) {
            vectorList.add(getBestCase(i));
        }
        return vectorList;
    }

    public List<Vector> getWorstVectors(int minPowRange, int maxPowRange) {
        List<Vector> vectorList = new ArrayList<>();
        for(int i = minPowRange; i <= maxPowRange; i++) {
            vectorList.add(getWorstCase(i));
        }
        return vectorList;
    }

    public Vector getRandomVectorPowerOfTwoSize(int powerOfTwo) {
        int size = (int) Math.pow(2, powerOfTwo);
        Vector vector = new Vector();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            vector.add(random.nextInt());
        }
        return vector;
    }

    public static Vector getBestCase(int powerOfTwo) {
        int size = (int) Math.pow(2, powerOfTwo);
        Vector vector = new Vector();
        for (int i = 0; i < size; i++) {
            vector.add(i);
        }
        return vector;
    }

    public Vector getWorstCase(int powerOfTwo){
        int size = (int) Math.pow(2, powerOfTwo);
        Vector vector = new Vector();
        for (int i = size; i > 0; i--) {
            vector.add(i);
        }
        return vector;
    }
}
