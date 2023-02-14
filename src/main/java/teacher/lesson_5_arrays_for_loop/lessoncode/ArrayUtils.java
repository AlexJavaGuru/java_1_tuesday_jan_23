package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Random;

public class ArrayUtils {

    public int[] createArray(int arrayLength) {
        int[] result = new int[arrayLength];
        return result;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
//        iter
//        fori
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
    }
}
