package student_nikita_visnakovs.lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] number = new int[arrayLength];
        return number;
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
        int maxNum = array[0];
        for (int number : array) {
            if (number > maxNum) {
                maxNum = number;
            }
        }
        return maxNum;
    }

    public int findMinNumber(int[] array) {
        int minNum = array[0];
        for (int number : array) {
            if (number < minNum) {
                minNum = number;
            }
        }
        return minNum;
    }
}
