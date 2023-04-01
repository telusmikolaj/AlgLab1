package telusmikolaj;

import java.util.Arrays;

public class Vector {

    private static final int DEFAULT_CAPACITY = 3;
    private int[] array;

    private int size;

    public Vector() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public Vector(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        if (size == array.length) {
            createExtendedArray();
        }
        array[size] = value;
        size++;
    }

    private void createExtendedArray() {
        int[] newArray = new int[array.length * 2];
        newArray = Arrays.copyOf(array, newArray.length);
        array = newArray;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = value;
    }

    public int capacity() {
        return array.length;
    }

}
