package student_andrejs_cekalins.lesson_7.level_6.Task_12;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.copyInRangeCheck();
    }

    public void copyInRangeCheck() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {100, 15, 20, 67, 92, 99, 43, 56, 42, 22};
        int[] expectedResult = {20, 67, 92, 43, 56, 42, 22};
        int[] realResult = arrayCopy.copyInRange(array, 20, 95);
        checkResult(expectedResult, realResult, "Copy in range check test");
    }

    private void checkResult(int[] realResult, int[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}

