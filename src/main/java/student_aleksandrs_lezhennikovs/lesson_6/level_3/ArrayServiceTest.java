package student_aleksandrs_lezhennikovs.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {

    public static void main(String[] args) {

        trueTestSearchInArray();
        falseTestSearchInArray();
        checkNumberOfOccurrencesInArray();
        checkFailNumberOfOccurrencesInArray();
        checkReplaceNumberInArray();
        checkFailReplaceNumberInArray();
        checkAllReplaceNumbersInArray();
        checkFalseAllReplaceNumbersInArray();
        checkFlipArray();
        checkSortArray();
    }

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    static void trueTestSearchInArray() {

        int[] initArray = {4, 7, 10, 500, 35, 777};
        int findNumber = 35;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean calculatedResult = arrayService.isNumberInArray(initArray, findNumber);
        checkTestResult(expectedResult == calculatedResult, "True test search in array");
    }

    static void falseTestSearchInArray() {

        int[] initArray = {4, 7, 10, 500, 35, 777};
        int findNumber = 1000;
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean calculatedResult = arrayService.isNumberInArray(initArray, findNumber);
        checkTestResult(expectedResult == calculatedResult, "False test search in array");
    }

    static void checkNumberOfOccurrencesInArray() {

        int[] initArray = {4, 7, 10, 7, 500, 7, 35, 777};
        int checkNumber = 7;
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int calculatedResult = arrayService.numberOfOccurrencesInArray(initArray, checkNumber);
        checkTestResult(expectedResult == calculatedResult, "Number of occurrences in array test");
    }

    static void checkFailNumberOfOccurrencesInArray() {

        int[] initArray = {4, 7, 10, 7, 500, 7, 35, 777};
        int checkNumber = 1;
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int calculatedResult = arrayService.numberOfOccurrencesInArray(initArray, checkNumber);
        checkTestResult(expectedResult == calculatedResult, "Fail number of occurrences in array test");
    }

    static void checkReplaceNumberInArray() {

        int[] initArray = {4, 7, 10, 7, 500, 7, 35, 777};
        int findNumber = 7;
        int replaceNumber = 555;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean calculatedResult = arrayService.replaceNumberInArray(initArray, findNumber, replaceNumber);
        checkTestResult(expectedResult == calculatedResult, "Replace number in array test");
    }

    static void checkFailReplaceNumberInArray() {

        int[] initArray = {4, 7, 10, 7, 500, 7, 35, 777};
        int findNumber = 1;
        int replaceNumber = 555;
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean calculatedResult = arrayService.replaceNumberInArray(initArray, findNumber, replaceNumber);
        checkTestResult(expectedResult == calculatedResult, "Replace not existed number in array test");
    }

    static void checkAllReplaceNumbersInArray() {

        int[] initArray = {4, 7, 10, 7, 500, 7, 35, 777};
        int findNumber = 7;
        int replaceNumber = 555;
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int calculatedResult = arrayService.replaceAllNumberInArray(initArray, findNumber, replaceNumber);
        checkTestResult(expectedResult == calculatedResult, "Replace all numbers in array test");
    }

    static void checkFalseAllReplaceNumbersInArray() {

        int[] initArray = {4, 7, 10, 7, 500, 7, 35, 777};
        int findNumber = 1;
        int replaceNumber = 555;
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int calculatedResult = arrayService.replaceAllNumberInArray(initArray, findNumber, replaceNumber);
        checkTestResult(expectedResult == calculatedResult, "Replace not existed numbers in array test");
    }

    static void checkFlipArray() {

        int[] initArray = {7, 4, 10, 3};
        int[] expectedResult = {3, 10, 4, 7};
        ArrayService arrayService = new ArrayService();
        arrayService.flipArray(initArray);
        checkTestResult(Arrays.equals(expectedResult, initArray), "Flip array test");
    }

    static void checkSortArray() {

        int[] initArray = {5, 4, 3, 2, 1};
        int[] expectedResult = {1, 2, 3, 4, 5};
        ArrayService arrayService = new ArrayService();
        arrayService.flipArray(initArray);
        checkTestResult(Arrays.equals(expectedResult, initArray), "Sort array test");
    }
}
