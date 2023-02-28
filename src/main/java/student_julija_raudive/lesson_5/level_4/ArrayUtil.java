package student_julija_raudive.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {

        int[] array = new int[arrayLength];
        return array;
    }


    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);

        }
    }

    public void printArrayToConsole(int[] array) {

        System.out.println(Arrays.toString(array));

    }

    public int findMaxNumber(int[] array) {
        int maxValue = array[0];
        for (int value : array) {

            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;


    }

    public int findMinNumber(int[] array) {

        int minValue = array[0];
        for (int value : array) {

            if (value < minValue) {
                minValue = value;
            }

        }
        return minValue;
    }

}
