package student_vladislav_romanov.lesson_5.level_5;

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

}
