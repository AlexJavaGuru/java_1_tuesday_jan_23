package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_5_middle;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();

        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 3;
        int[] array = arrayUtil.createArray(expectedResult);
        int actualResult = array.length;
        check(expectedResult, actualResult, "Test create array");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {34, 56, 98, 78, 5};
        int expectedResult = 98;
        int actualResult = arrayUtil.findMaxNumber(array);
        check(actualResult, expectedResult, "Test find max number");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {34, 56, 98, 78};
        int expectedResult = 34;
        int actualResult = arrayUtil.findMinNumber(array);
        check(actualResult, expectedResult, "Test find min number");
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}