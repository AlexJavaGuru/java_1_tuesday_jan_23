package student_anastasiia_bokareva.lesson9.level1;

import java.util.Random;
import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayUtilImpl implements ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    @Override
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }

    @Override
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if (max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    @Override
    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if (min.isPresent()) {
            minValue = min.getAsInt();
        }
        return minValue;
    }

}

