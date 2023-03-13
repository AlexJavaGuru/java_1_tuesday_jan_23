package student_ilya_tihonov.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {

    public static void main(String[] args) {
        testContainsNumberPositive();
        testContainsNumberNegative();
        testCountOccurrencesPositive();
        testCountOccurrencesNegative();
        testReplaceFirst();
        testReplaceAll();
        testReverse();
        testSortingNumbers();
    }


    public static void testContainsNumberPositive() {
            ArrayService service = new ArrayService();
            int[] array = {1, 2, 3, 4, 5};
            boolean result = service.containsNumber(array, 3);
        }

        public static void testContainsNumberNegative() {
            ArrayService service = new ArrayService();
            int[] array = {1, 2, 3, 4, 5};
            boolean result = service.containsNumber(array, 6);
        }


        public static void testCountOccurrencesPositive () {
            ArrayService arrayService = new ArrayService();
            int[] array = {1, 2, 3, 3};
            int numberToCount = 3;
            int expectedCount = 2;
            int actualCount = arrayService.countOccurrences(array, numberToCount);
            if (expectedCount != actualCount) {
                throw new AssertionError("Expected count: " + expectedCount + ", but was: " + actualCount);
            }
        }
        public static void testCountOccurrencesNegative () {
            ArrayService arrayService = new ArrayService();
            int[] array = {1, 2, 3, 3};
            int numberToCount = 4;
            int expectedCount = 0;
            int actualCount = arrayService.countOccurrences(array, numberToCount);
            if (expectedCount != actualCount) {
                throw new AssertionError("Expected count: " + expectedCount + ", but was: " + actualCount);
            }
        }
        public static void testReplaceFirst() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};

        arrayService.replaceFirst(array, 3, 7);
        if (!Arrays.equals(array, new int[]{1, 2, 7, 4, 5})) {
            System.out.println("Test failed: array is " + Arrays.toString(array));
        }

        arrayService.replaceFirst(array, 6, 9);
        if (!Arrays.equals(array, new int[]{1, 2, 7, 4, 5})) {
            System.out.println("Test failed: array is " + Arrays.toString(array));
        }

        arrayService.replaceFirst(array, 1, 0);
        if (!Arrays.equals(array, new int[]{0, 2, 7, 4, 5})) {
            System.out.println("Test failed: array is " + Arrays.toString(array));
        }
    }

    public static void testReplaceAll() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5, 3};

        arrayService.replaceAll(array, 3, 7);
        if (!Arrays.equals(array, new int[]{1, 2, 7, 4, 5, 7})) {
            System.out.println("Test failed: array is " + Arrays.toString(array));
        }

        arrayService.replaceAll(array, 6, 9);
        if (!Arrays.equals(array, new int[]{1, 2, 7, 4, 5, 7})) {
            System.out.println("Test failed: array is " + Arrays.toString(array));
        }

        arrayService.replaceAll(array, 7, 0);
        if (!Arrays.equals(array, new int[]{1, 2, 0, 4, 5, 0})) {
            System.out.println("Test failed: array is " + Arrays.toString(array));
        }
    }

    public static void testReverse() {
        ArrayService service = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        service.reverse(array);
        if (!Arrays.equals(array, new int[]{5, 4, 3, 2, 1})) {
            throw new AssertionError("testReverse failed: expected [5, 4, 3, 2, 1], but was " + Arrays.toString(array));
        }
    }
    public static void testSortingNumbers() {
        ArrayService arrayService = new ArrayService();

        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] expectedArr = {1, 2, 5, 5, 6, 9};

        arrayService.sortingNumbers(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expectedArr[i]) {
                System.out.println("Test failed: sortingNumbers");
                return;
            }
        }

        System.out.println("Test passed: sortingNumbers");
    }

}

