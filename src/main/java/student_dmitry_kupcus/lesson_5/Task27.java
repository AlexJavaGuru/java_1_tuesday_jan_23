package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Random;

class Task27 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Random rand = new Random();
        int arraySize = rand.nextInt(10);
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(100);
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Arrays quantity is: " + array.length);
        System.out.println("Elements in array: " + Arrays.toString(array));
        System.out.println("Higher element in arrays is: " + max);
    }
}
