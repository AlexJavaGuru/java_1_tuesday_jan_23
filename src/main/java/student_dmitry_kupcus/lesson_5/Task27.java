package student_dmitry_kupcus.lesson_5;

import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Random rand = new Random();

        int arraySize = rand.nextInt(10);
        int[] array = new int[arraySize];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.findMaxNumber(array);
    }
}
