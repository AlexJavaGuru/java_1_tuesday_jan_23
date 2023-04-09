package student_dmitry_kupcus.lesson_6;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTrue();
        arrayServiceTest.containsFalse();
        arrayServiceTest.howMuchContainsTestTrue();
        arrayServiceTest.howMuchContainsTestFalse();
        arrayServiceTest.changeFirstNumberInArrayTrue();
        arrayServiceTest.changeFirstNumberInArrayFalse();
        arrayServiceTest.replaceAllNumberInArrayTrue();
        arrayServiceTest.replaceAllNumberInArrayFalse();
        arrayServiceTest.revertArrayTest();
        arrayServiceTest.sortArraysTest();
    }

    public void containsTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3};
        int checkNumber = 3;
        boolean expectedResult = true;
        boolean actualResult = arrayService.contains(array, checkNumber);
        checkResult(expectedResult, actualResult, "containsTrueTest");
    }

    public void containsFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3};
        int checkNumber = 6;
        boolean expectedResult = false;
        boolean actualResult = arrayService.contains(array, checkNumber);
        checkResult(expectedResult, actualResult, "containsFalseTest");
    }

    public void howMuchContainsTestTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 1};
        int checkNumber = 1;
        int expectedResult = 2;
        int actualResult = arrayService.howMuchContains(array, checkNumber);
        checkResult(expectedResult, actualResult, "howMuchContainsTestTrue");
    }

    public void howMuchContainsTestFalse() {
        ArrayService arrayService = new ArrayService();
        int checkNumber = 5;
        int[] array = {1, 2, 1};
        int expectedResult = 0;
        int actualResult = arrayService.howMuchContains(array, checkNumber);
        checkResult(expectedResult, actualResult, "howMuchContainsTestFalse");
    }

    public void changeFirstNumberInArrayTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 2, 3, 4, 5};
        int changeNumber = 10;
        int changeNumberTo = 1;
        int[] expectedResult = {1, 2, 3, 4, 5};
        arrayService.changeFirstNumberInArray(array, changeNumber, changeNumberTo);
        checkResult(expectedResult, array, "changeFirstNumberInArrayTrue");
    }

    public void changeFirstNumberInArrayFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 2, 3, 4, 5};
        int changeNumber = 6;
        int changeNumberTo = 1;
        int[] expectedResult = {10, 2, 3, 4, 5};
        arrayService.changeFirstNumberInArray(array, changeNumber, changeNumberTo);
        checkResult(expectedResult, array, "changeFirstNumberInArrayTrue");
    }

    public void replaceAllNumberInArrayTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 2, 2};
        int changeNumber = 2;
        int changeNumberTo = 100;
        int expectedResult = 2;
        int actualResult = arrayService.replaceAllNumberInArray(array, changeNumber, changeNumberTo);
        checkResult(expectedResult, actualResult, "replaceAllNumberInArrayTrue");
    }

    public void replaceAllNumberInArrayFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 2, 2, 2};
        int changeNumbers = 3;
        int changeNumbersTo = 5;
        int expectedResult = 3;
        int actualResult = arrayService.replaceAllNumberInArray(array, changeNumbers, changeNumbersTo);
        checkResult(expectedResult, actualResult, "replaceAllNumberInArrayFalse");
    }

    public void revertArrayTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4};
        int[] expectedResult = {4, 3, 2, 1};
        arrayService.revertArray(array);
        checkResult(expectedResult, array, "revertArrayTest");
    }

    public void sortArraysTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 3, 4, 1};
        int[] expectedResult = {1, 2, 3, 4};
        arrayService.sortArrays(array);
        checkResult(expectedResult, array, "sortArraysTest");

    }

    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }

    public void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }

    public void checkResult(int[] actualResult, int[] expectedResult, String testName) {
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }
}
