package student_andrejs_cekalins.lesson_6.level_3.Task17;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.sortArray();
        test.notSortArray();
    }
    public void sortArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 2, 4, 6, 8, 10, 7, 5, 9, 3, 1};
        int[] expectedResult = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayService.sort(array);
        checkResult(Arrays.equals(array,expectedResult), "Sort test ");
    }
    public void notSortArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 2, 4, 6, 8, 10, 7, 5, 9, 3, 1};
        int[] expectedResult = {-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayService.sort(array);
        checkResult(!Arrays.equals(array,expectedResult), "Not sort test ");
    }
    private void checkResult(boolean condition, String testName) {
            if (condition) {
                System.out.println(testName + " = OK");
            } else {
                System.out.println(testName + " = Fail");
            }
        }
}
