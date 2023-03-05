package student_natalja_semitseva.level_3;


import java.util.Arrays;

public class ArrayServiceTest {


    public static void main(String[] args) {
        ArrayServiceTest testArrayService = new ArrayServiceTest();
        testArrayService.containsPositive();
        testArrayService.containsNegative();
        testArrayService.countOccurrences();
        testArrayService.countOccurrencesNone();
        testArrayService.replaceFirst();
        testArrayService.replaceFirstNegative();
        testArrayService.replaceAll();
        testArrayService.revert();
        testArrayService.sort();

    }

    public void containsPositive() {
        ArrayService testArrayService = new ArrayService();
        int[] arr = {5, 6, 7, 8, 9};
        boolean expected = true;
        boolean condition = testArrayService.contains(arr, 5);
        checkTestResult(expected == condition, "ContainsPositive");


    }

    public void containsNegative() {
        ArrayService testArrayService = new ArrayService();
        int[] arr = {5, 6, 7, 8, 9};
        boolean expected = true;
        boolean condition = testArrayService.contains(arr, 10);
        checkTestResult1(expected == condition, "Contains Negative");
    }

    public void countOccurrences() {
        ArrayService testArrayService = new ArrayService();
        int result = 3;
        int[] arr = {1, 5, 5, 5, 4, 6};
        int realResult = testArrayService.countOccurrences(arr, 5);
        checkTestResult(result == realResult, "countOccurrencesNumbers");
    }

    public void countOccurrencesNone() {
        ArrayService testArrayService = new ArrayService();
        int result = 0;
        int[] arr = {2, 5, 5, 5, 4, 7};
        int realResult = testArrayService.countOccurrences(arr, 8);
        checkTestResult(result == realResult, "countOccurrencesNon");
    }

    public void replaceFirst() {
        ArrayService testArrayService = new ArrayService();
        int[] array = {1, 2, 6, 3, 7, 8, 9, 10, 10, 11,};
        boolean expected = true;
        boolean replaceFirst = testArrayService.replaceFirst(array, 3, 22);
        checkTestResult(replaceFirst == expected, "replaceFirst");
    }

    public void replaceFirstNegative() {
        ArrayService testArrayService = new ArrayService();
        int[] array = {1, 2, 6, 7, 10, 11};
        boolean expected = false;
        boolean replaceFirst = testArrayService.replaceFirst(array, 2, 20);
        checkTestResult1(replaceFirst == expected, "replaceFirstNegative ");
    }

    public void replaceAll() {
        ArrayService testArrayService = new ArrayService();
        int[] expectedArray = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int[] expected = {100, 2, 3, 100, 2, 3, 100, 2, 3};
        int expectedCounter = 3;
        int resultCounter = testArrayService.replaceAll(expectedArray, 1, 100);
        checkTestResult(resultCounter == expectedCounter && Arrays.equals(expected, expectedArray), "replaceAll");

    }

    public void revert() {
        ArrayService testArrayService = new ArrayService();
        int[] expectedArray = {2, 5, 6, 4, 7, 8};
        int[] expected = {8, 7, 4, 6, 5, 2};
        testArrayService.revert(expected);


    }

    public void sort() {
        ArrayService testArrayService = new ArrayService();

        int[] array = {2, -1, 5, 3, 6, 7, -2};
        int[] expected = {-2, -1, 2, 3, 5, 6, 7};
        testArrayService.sort(expected);
        checkTestResult((expected!= array), "Sort");


    }


    public void checkTestResult1(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " =  FAIL!");
        } else {
            System.out.println(testName + " = OK!");

        }
    }

    public void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");

        }
    }
}
