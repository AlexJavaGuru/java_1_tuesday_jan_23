package student_aleksandrs_lezhennikovs.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {
        testArrayCopy();
    }

    public static void testArrayCopy() {
        int[] initArray = {4, 10, 30, 50, 33, 45, 100, 15, 120};
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] expectedResult = {30, 33, 45, 15};
        int[] calculatedResult = arrayCopy.copyInRange(initArray, 15, 45);
        check("Copy array in range", expectedResult, calculatedResult);
    }

    public static void check(String actionName, int[] expect, int[] actual) {
        if (Arrays.equals(expect, actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
