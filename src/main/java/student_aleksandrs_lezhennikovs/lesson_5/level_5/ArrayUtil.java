package student_aleksandrs_lezhennikovs.lesson_5.level_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {

        int[] numbers = new int[arrayLength];

        return numbers;
    }

    public void fillArrayWithRandomNumbers(int[] array) {

        Random random = new Random();
        for (int count = 0; count < array.length; count++) {
            array[count] = random.nextInt(50);
        }
    }

    public void printArrayToConsole(int[] array) {

        String result = "";
        for (int count = 0; count < array.length; count++) {
            if (count == 0) {
                result = "[" + array[count];
            } else if (count == array.length -1) {
                result = result +  ", " + array[count] + "]";
            } else {
                result = result + ", " + array[count];
            }
        }
        System.out.println(result);
    }

    public int findMaxNumber(int[] array) {

        int result = array[0];
        for (int number : array) {
            result = maxOfTwo(result, number);
        }
        return result;
    }

    private static int maxOfTwo(int firstNumber, int secondNumber) {

        int result;
        if (firstNumber >= secondNumber) {
            result = firstNumber;
        } else {
            result = secondNumber;
        }
        return result;
    }

    public int findMinNumber(int[] array) {
        int result = array[0];
        for (int number : array) {
            result = minOfTwo(result, number);
        }
        return result;
    }

    private static int minOfTwo(int firstNumber, int secondNumber) {

        int result;
        if (firstNumber <= secondNumber) {
            result = firstNumber;
        } else {
            result = secondNumber;
        }
        return result;
    }
}
