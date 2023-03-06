package student_oksana_tarasova.lesson_5.level_7;

import java.util.Arrays;
import java.util.Random;

class ArraysUtilAndNewMethodsAdded {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }


    public void  fillArrayWithRandomNumbers(int[] array,int numberRange) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numberRange);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int findSumAllNumbersArray(int[] array) {
        int sum = 0;
        for (int numberCell : array) {
            sum += numberCell;
        }
        return sum;
    }

    public double findAverageOfAllNumbersInTheArray(int[] array) {
        double sum = 0;
        for (int numberCell : array) {
            sum += numberCell;
        }
        return sum / array.length;
    }

    public int[] doubleTheValueOfArrayNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        return array;
    }

    String evenArrayNumbers(int[] array) {
        String even = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even += array[i] + "; ";
            }
        }
        return even;
    }

    String oddArrayNumbers(int[] array) {
        String odd = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd += array[i] + "; ";
            }
        }
        return odd;
    }

}
