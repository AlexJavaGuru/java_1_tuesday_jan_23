package student_daniels_belejuns.lesson_6.level_3.task_17;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.sortArray();
        test.notSortArray();
    }
    public void sortArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        int[] expectedResult = {10, 14, 15, 12, 13};
        arrayService.sort(array);
        checkResult(Arrays.equals(array, expectedResult), "Sort test ");
    }
    public void notSortArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        int[] expectedResult = {14, 13, -10, 12, 15};
        arrayService.sort(array);
        checkResult(!Arrays.equals(array, expectedResult), "Not sort test ");
    }
    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
