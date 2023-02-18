package student_andrejs_cekalins.lesson_5.level_5.Task_31;


import java.util.Arrays;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] intArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithIntegerNumbers(intArray);
        System.out.print(Arrays.toString(intArray));

    }
}
