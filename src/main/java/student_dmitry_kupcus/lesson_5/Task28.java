package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Random;

class Task28 {
    public static void main(String[] args) {

        Random rand = new Random();
        int arraySize = rand.nextInt(10);
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(100);
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Elements in array: " + Arrays.toString(array));
        System.out.println("Lower element in arrays is: " + min);
    }
}
