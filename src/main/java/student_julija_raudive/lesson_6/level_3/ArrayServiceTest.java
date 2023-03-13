package student_julija_raudive.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsNumber();
        test.doesNotContainsNumber();
        test.countOccurrencesZeroTimes();
        test.countOccurrencesThreeTimes();
        test.shouldReplaceNumber();
        test.shouldNotReplaceNumber();
        test.shouldReplaceAllNumbers();
        test.shouldNotReplaceAllNumbers();
        test.reverseArray();
        test.sortArray();

    }

    public void containsNumber() {
        boolean result = true;
        int[] arr = {1, 5, 7, 8, 4, 6};
        boolean realResult = arrayService.contains(arr, 5);
        checkResults(result == realResult, "Contains number");
    }

    public void doesNotContainsNumber() {
        boolean result = false;
        int[] arr = {1, 5, 7, 8, 4, 6};
        boolean realResult = arrayService.contains(arr, 9);
        checkResults(result == realResult, "Does not contains number");
    }

    public void countOccurrencesZeroTimes() {
        int result = 0;
        int[] arr = {1, 5, 7, 8, 4, 6};
        int realResult = arrayService.countOccurrences(arr, 9);
        checkResults(result == realResult, "Count occurrences zero times");

    }

    public void countOccurrencesThreeTimes() {
        int result = 3;
        int[] arr = {1, 5, 7, 5, 4, 5};
        int realResult = arrayService.countOccurrences(arr, 5);
        checkResults(result == realResult, "Count occurrences three times");

    }

    public void shouldReplaceNumber() {
        boolean result = true;
        int[] arr = {1, 5, 7, 5, 4, 5};
        int[] arrResult = {1, 8, 7, 5, 4, 5};
        boolean realResult = arrayService.replaceNumber(arr, 5, 8);
        checkResults((result == realResult && Arrays.equals(arr, arrResult)), "First number replaced");

    }

    public void shouldNotReplaceNumber() {
        boolean result = false;
        int[] arr = {1, 5, 7, 5, 4, 5};
        int[] arrResult = {1, 5, 7, 5, 4, 5};
        boolean realResult = arrayService.replaceNumber(arr, 3, 8);
        checkResults((result == realResult && Arrays.equals(arr, arrResult)), "First number wasn't replaced");

    }

    public void shouldReplaceAllNumbers() {
        int result = 3;
        int[] arr = {1, 5, 7, 5, 4, 5};
        int[] arrResult = {1, 8, 7, 8, 4, 8};
        int realResult = arrayService.replaceAllNumbers(arr, 5, 8);
        checkResults((result == realResult && Arrays.equals(arr, arrResult)), "All numbers replaced");

    }

    public void shouldNotReplaceAllNumbers() {
        int result = 0;
        int[] arr = {1, 5, 7, 5, 4, 5};
        int[] arrResult = {1, 5, 7, 5, 4, 5};
        int realResult = arrayService.replaceAllNumbers(arr, 2, 8);
        checkResults((result == realResult && Arrays.equals(arr, arrResult)), "Numbers wasn't replaced");

    }

    public void reverseArray() {
        int[] arr = {1, 4, 2, 8, 7, 9};
        int[] arrResult = {9, 7, 8, 2, 4, 1};
        arrayService.reverse(arr);
        checkResults(Arrays.equals(arr, arrResult), "Reverse");

    }

    public void sortArray() {
        int[] arr = {1, -4, 20, 83, -73, 18};
        int[] arrResult = {-73, -4, 1, 18, 20, 83};
        arrayService.sort(arr);
        checkResults(Arrays.equals(arr, arrResult), "Sort");

    }


    public void checkResults(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + " test: OK");
        } else {
            System.out.println(testName + " test: FAIL");
        }
    }


}
