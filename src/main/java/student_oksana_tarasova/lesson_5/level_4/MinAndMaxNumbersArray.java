package student_oksana_tarasova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class MinAndMaxNumbersArray {
    public static void main(String[] args) {
        MinAndMaxNumbersArray minAndMaxNumbersArray = new MinAndMaxNumbersArray();
        int[] arrayNumbers = minAndMaxNumbersArray.createArray();
        minAndMaxNumbersArray.arrayFilling(arrayNumbers);
        minAndMaxNumbersArray.printInfo(arrayNumbers);
        System.out.println("Maximum number array: " + minAndMaxNumbersArray.maxNumber(arrayNumbers));
        System.out.println("Minimum number array: " + minAndMaxNumbersArray.minNumber(arrayNumbers));
    }

    Random random = new Random();

    public int[] createArray() {
        int arrayLength = random.nextInt(10);
        int[] arrayNumber = new int[arrayLength];
        return new int[arrayLength];
    }

    public int[] arrayFilling(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
        }
        return array;
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
