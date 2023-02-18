package student_andrejs_cekalins.lesson_5.level_5.Task_33;

import java.util.Arrays;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] intArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
