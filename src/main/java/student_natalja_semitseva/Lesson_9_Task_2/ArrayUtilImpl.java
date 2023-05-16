package student_natalja_semitseva.Lesson_9_Task_2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class ArrayUtilImpl implements ArrayUtil {

    public int[] createArray(int arrayLength) {

        int[] ints = new int[arrayLength];


        return ints;
    }

    @Override
    public void createArray() {

    }


    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }

    }

    @Override
    public void fillArrayWithRandomNumbers() {

    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void printArrayToConsole() {

    }

    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if (max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    @Override
    public int findMaxNumber() {
        return 0;
    }

    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if (min.isPresent()) {
            minValue = min.getAsInt();
        }
        return minValue;
    }

    @Override
    public int findMinNumber() {
        return 0;
    }
}
