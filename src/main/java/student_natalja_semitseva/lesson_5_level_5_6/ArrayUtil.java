package student_natalja_semitseva.lesson_5_level_5_6;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] intArray = new int[arrayLength];
        return intArray;

    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }


    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));

    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i > array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }


    public int findMinNumber(int[] array) {

        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > min) {
                min = array[j];
            }
        }
        return min;
    }
}