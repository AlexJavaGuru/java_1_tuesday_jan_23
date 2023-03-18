package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_5_middle;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] result = new int[arrayLength];
        return result;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

        public void printArrayToConsole (int[] array) {
            System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}