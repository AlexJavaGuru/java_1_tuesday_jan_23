package student_dmitry_kupcus.lesson_5;

import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayUtil arrayUtil = new ArrayUtil();

        int arraySize = rand.nextInt(10);
        int[] array = new int[arraySize];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.findMinNumber(array);
    }
}
