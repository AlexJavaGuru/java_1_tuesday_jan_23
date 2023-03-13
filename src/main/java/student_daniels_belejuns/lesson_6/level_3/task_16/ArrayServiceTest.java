package student_daniels_belejuns.lesson_6.level_3.task_16;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.arrayReverted();
        test.arrayNotReverted();
    }

    public void arrayReverted() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        int[] expectedResult = {15, 14, 13, 12, 10};
        arrayService.revert(array);
        checkResult(Arrays.equals(array, expectedResult), "Array reverted test ");
    }

    public void arrayNotReverted() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        int[] expectedResult = {15, 14, 13, 12, 10};
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
