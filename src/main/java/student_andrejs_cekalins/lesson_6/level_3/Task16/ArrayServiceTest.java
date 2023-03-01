package student_andrejs_cekalins.lesson_6.level_3.Task16;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.arrayReverted();
        test.arrayNotReverted();
    }

    public void arrayReverted() {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] expectedResult = {7, 6, 5, 4, 3, 2, 1, 0};
        arrayService.revert(array);
        checkResult(Arrays.equals(array, expectedResult), "Array reverted test ");
    }

    public void arrayNotReverted() {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7};
        arrayService.revert(array);
        checkResult(!(Arrays.equals(array, expectedResult)), "Array not reverted test ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
