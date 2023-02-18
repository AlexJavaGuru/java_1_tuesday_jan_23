package student_andrejs_cekalins.lesson_5.level_5.Task_33;

import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] results = new int[arrayLength];
        return results;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
