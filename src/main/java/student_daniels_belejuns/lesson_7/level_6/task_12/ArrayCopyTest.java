package student_daniels_belejuns.lesson_7.level_6.task_12;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        copyTestArray();
    }

    public static void copyTestArray() {
        int[] input = {1, 3, 5, 7, 9, 11};
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] expectedOutput = {3, 5, 7, 9};
        int[] actualOutput = arrayCopy.copyInRange(input, 2, 10);
        ArrayCopyTest.test("Array", expectedOutput, actualOutput);
    }

    public static void test(String actionName, int[] expect, int[] actual) {
        if (Arrays.equals(expect, actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
