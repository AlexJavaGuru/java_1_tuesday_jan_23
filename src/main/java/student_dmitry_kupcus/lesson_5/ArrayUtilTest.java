package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.OptionalInt;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] test = new int [11];
        int[] expectedResult = new int [11];
        int[] actualResult = arrayUtil.createArray(test.length);
        if (actualResult.length == expectedResult.length) {
            System.out.println("Test: Create array passed");
        } else {
            System.out.println("Test: Create array failed");
        }
    }
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {1,2,3,4,5};
        OptionalInt test = Arrays.stream(testArray).max();
        int expectedResult = 5;
        int actualResult = arrayUtil.findMaxNumber(testArray);
        if (actualResult == expectedResult) {
            System.out.println("Test: Find max number passed");
        } else {
            System.out.println("Test: Find max number failed");
        }
    }
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {5,6,7,8,9};
        OptionalInt test = Arrays.stream(testArray).min();
        int expectedResult = 5;
        int actualResult = arrayUtil.findMinNumber(testArray);
        if (actualResult == expectedResult) {
            System.out.println("Test: Find min number passed");
        } else {
            System.out.println("Test: Find min number failed");
        }
    }
}