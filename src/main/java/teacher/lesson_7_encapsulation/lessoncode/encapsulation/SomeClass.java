package teacher.lesson_7_encapsulation.lessoncode.encapsulation;

import java.util.Arrays;
import java.util.Random;

public class SomeClass {

    int[] createArray(int arrayLength) {
        int[] number = new int[arrayLength];
        return number;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    private void printArrayToConsole(int[] array) {

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
