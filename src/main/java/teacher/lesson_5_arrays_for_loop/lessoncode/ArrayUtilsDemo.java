package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ArrayUtilsDemo {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] intArray = arrayUtils.createArray(10);

        for (int element : intArray) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(intArray));

        arrayUtils.fillArrayWithRandomNumbers(intArray);

        System.out.println(Arrays.toString(intArray));
    }
}
