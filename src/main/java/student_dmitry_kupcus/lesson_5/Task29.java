package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class Task29 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arraySize = rand.nextInt(10);
        int [] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Elements in array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("This number of array is even: " + array[i]);
            }
        }
    }
}
