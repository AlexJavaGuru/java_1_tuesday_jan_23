package student_dmitry_kupcus.lesson_5;

import java.util.Random;

class Task29 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayUtil arrayUtil = new ArrayUtil();

        int arraySize = rand.nextInt(10);
        int[] array = new int[arraySize];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println("This number of array is even: " + j);
            }
        }
    }
}
