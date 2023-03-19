package student_vladislav_romanov.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    int succeedTests;
    int failedTests;

    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();

        arrayCopyTest.copyInRangeTestSucceed();
        arrayCopyTest.copyInRangeTestFailed();
        arrayCopyTest.isNumberInRangeTestSucceed();
        arrayCopyTest.isNumberInRangeTestFailed();
        arrayCopyTest.fillTemporaryArraySucceed();
        arrayCopyTest.fillTemporaryArrayFailed();
        arrayCopyTest.printStat();
    }

    public void copyInRangeTestSucceed() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {47, 92, 42, 15, 84, 77, 51, 42, 39, 51, 85, 13, 44, 44, 66, 79, 3, 5, 54, 94};
        int[] expected = {47, 42, 77, 51, 42, 39, 51, 44, 44, 66, 79, 54};
        int[] current = arrayCopy.copyInRange(array, 38, 80);
        printResult(Arrays.equals(expected, current), "copyInRangeTestSucceed");
    }

    public void copyInRangeTestFailed() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {47, 92, 42, 15, 84, 77, 51, 42, 39, 51, 85, 13, 44, 44, 66, 79, 3, 5, 54, 94};
        int[] expected = {47, 42, 77, 51, 42, 39, 51, 44, 44, 66, 79, 54};
        int[] current = arrayCopy.copyInRange(array, 38, 70);
        printResult(!Arrays.equals(expected, current), "copyInRangeTestFailed");
    }

    public void isNumberInRangeTestSucceed() {
        ArrayCopy arrayCopy = new ArrayCopy();
        boolean expected = true;
        boolean current = arrayCopy.isNumberInRange(44, 15, 70);
        printResult(current == expected, "isNumberInRangeTestSucceed");
    }

    public void isNumberInRangeTestFailed() {
        ArrayCopy arrayCopy = new ArrayCopy();
        boolean expected = true;
        boolean current = arrayCopy.isNumberInRange(10, 15, 70);
        printResult(expected != current, "isNumberInRangeTestFailed");
    }

    public void fillTemporaryArraySucceed() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {47, 92, 42, 15, 84, 77, 51, 42, 39, 51, 85, 13, 44, 44, 66, 79, 3, 5, 54, 94};
        int[] expected = {47, 42, 77, 51, 42, 39, 51, 44, 44, 66, 79, 54};
        int[] current = arrayCopy.fillTemporaryArray(array, 12, 38, 80);
        printResult(Arrays.equals(expected, current), "fillTemporaryArraySucceed");
    }

    public void fillTemporaryArrayFailed() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {47, 92, 42, 15, 84, 77, 51, 42, 39, 51, 85, 13, 44, 44, 66, 79, 3, 5, 54, 94};
        int[] expected = {47, 42, 77, 51, 42, 39, 51, 44, 44, 66, 79, 54};
        int[] current = arrayCopy.fillTemporaryArray(array, 13, 38, 80);
        printResult(!Arrays.equals(expected, current), "fillTemporaryArrayFailed");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
            succeedTests++;
        } else {
            System.out.println(test + " test FAILED");
            failedTests++;
        }
        System.out.println("----------------------------------------------------------");
    }

    public void printStat() {
        System.out.println(succeedTests + " tests SUCCEED.");
        System.out.println(failedTests + " tests FAILED.");
    }

}
