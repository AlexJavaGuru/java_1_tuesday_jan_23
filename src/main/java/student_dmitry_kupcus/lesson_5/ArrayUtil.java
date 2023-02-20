package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random rand = new Random();
        int[] arrayLength = createArray(array.length);
        for (int i = 0; i < arrayLength.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elements in array: " + Arrays.toString(array) + '\n');
            return;
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Higher element in arrays is: " + max);
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Lower element in arrays is: " + min);
        return min;
    }
}

