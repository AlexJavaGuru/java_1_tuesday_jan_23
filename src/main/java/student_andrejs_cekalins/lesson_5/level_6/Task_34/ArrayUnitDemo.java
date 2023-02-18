package student_andrejs_cekalins.lesson_5.level_6.Task_34;

import java.util.Arrays;

class ArrayUnitDemo {
    public static void main(String[] args) {
        ArrayUnit arrayUnit = new ArrayUnit();
        int[] intArray = arrayUnit.createArray(7);
        arrayUnit.printArrayToConsole(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
