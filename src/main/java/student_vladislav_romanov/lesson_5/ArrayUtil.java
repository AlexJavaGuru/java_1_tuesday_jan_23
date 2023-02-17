package student_vladislav_romanov.lesson_5;

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
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

}
