package student_andrejs_cekalins.lesson_5.level_5;

import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] results = new int[arrayLength];
        return results;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        int[] results = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            results[i] = random.nextInt(100);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}


