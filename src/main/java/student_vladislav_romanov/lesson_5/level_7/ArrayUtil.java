package student_vladislav_romanov.lesson_5.level_7;

import java.util.Random;

class ArrayUtil {

    Random random = new Random();

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = 0;
        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

}
