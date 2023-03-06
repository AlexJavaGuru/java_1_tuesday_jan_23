package student_oksana_tarasova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class MinAndMaxNumbersArray {
    public static void main(String[] args) {
        MinAndMaxNumbersArray minAndMaxNumbersArray = new MinAndMaxNumbersArray();
        int[] arrayNumbers = minAndMaxNumbersArray.createArray(12);
        minAndMaxNumbersArray.arrayFilling(arrayNumbers,100);
        minAndMaxNumbersArray.printInfo(arrayNumbers);
        System.out.println("Maximum number array: " + minAndMaxNumbersArray.maxNumber(arrayNumbers));
        System.out.println("Minimum number array: " + minAndMaxNumbersArray.minNumber(arrayNumbers));
    }

    Random random = new Random();

    public int[] createArray(int length) {
        int[] arrayNumber = new int[length];
        return new int[length];
    }

    public void arrayFilling(int[] array, int numberRange) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numberRange);
        }
    }

    public void printInfo(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int minNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
