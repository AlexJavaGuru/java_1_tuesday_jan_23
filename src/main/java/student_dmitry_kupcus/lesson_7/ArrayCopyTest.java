package student_dmitry_kupcus.lesson_7;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.ArrayCopyTestFalse();
        arrayCopyTest.ArrayCopyTestTrue();

    }

    public void ArrayCopyTestFalse() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] expectedResult = {};
        int[] actualResult = arrayCopy.copyInRange(new int[]{5, 6, 7, 8}, 1, 4);
        checkResult(expectedResult, actualResult, "ArrayCopyTestFalse");
    }

    public void ArrayCopyTestTrue() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] expectedResult = {2, 3, 4, 5, 6, 7};
        int[] actualResult = arrayCopy.copyInRange(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 2, 7);
        checkResult(expectedResult, actualResult, "ArrayCopyTestTrue");
    }

    public static void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }
}
