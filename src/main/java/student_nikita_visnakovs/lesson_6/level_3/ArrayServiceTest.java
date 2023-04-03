package student_nikita_visnakovs.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest tester = new ArrayServiceTest();
        tester.testContainsTrue();
        tester.testContainsFalse();
        tester.testCountOccurrencesFirst();
        tester.testCountOccurrencesSecond();
        tester.testNumberChangesFirst();
        tester.testNumberChangesSecond();
        tester.testChangeAllFirst();
        tester.testChangeAllSecond();
        tester.testReverts();
        tester.testSortAscending();
    }

    public void testContainsTrue() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = subject.contains(arr, 2);
        checkResult(actualResult, "Contains numbers test first");

    }

    public void testContainsFalse() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = subject.contains(arr, 6);
        checkResult(!actualResult, "Contains number test second");
    }

    public void testCountOccurrencesFirst() {
        ArrayService subject = new ArrayService();
        int[] arr = {3, 3, 2, 3, 2};
        int expectedResult = 3;
        int actualResult = subject.countOccurrences(arr, 3);
        checkResult(expectedResult, actualResult, "Count occurrence test first");

    }

    public void testCountOccurrencesSecond() {
        ArrayService subject = new ArrayService();
        int[] arr = {3, 3, 2, 3, 2};
        int expectedResult = 0;
        int actualResult = subject.countOccurrences(arr, 5);
        checkResult(expectedResult, actualResult, "Count occurrence test second");
    }

    public void testNumberChangesFirst() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 4, 4, 5};
        boolean actualResult = subject.changeFirst(arr, 4, 3);
        checkResult(actualResult, "Number changes first test");
    }

    public void testNumberChangesSecond() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 4, 4, 5};
        boolean actualResult = subject.changeFirst(arr, 6, 1);
        checkResult(!actualResult, "Number changes second text");
    }

    public void testChangeAllFirst() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 6, 3, 4, 5};
        int expectedResult = 2;
        int actualResult = subject.changeAll(arr, 3, 8);
        checkResult(actualResult, expectedResult, "All numbers changes test first");
    }

    public void testChangeAllSecond() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 6, 3, 4, 5};
        int expectedResult = 0;
        int actualResult = subject.changeAll(arr, 7, 8);
        checkResult(actualResult, expectedResult, "All numbers changes test second");
    }

    public void testReverts() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        subject.reverts(arr);
        checkResult(expectedResult, arr, "Reverts test");
    }

    public void testSortAscending() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 5, 2, 4, 3, 6, 7};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        subject.sortAscending(arr);
        checkResult(expectedResult,arr,"Sort ascending test");
    }

    void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " filed!");
        }
    }

    void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " filed!");
        }
    }
}
