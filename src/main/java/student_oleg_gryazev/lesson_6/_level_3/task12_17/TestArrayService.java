package student_oleg_gryazev.lesson_6._level_3.task12_17;

import java.util.Arrays;

public class TestArrayService {

    public static void main(String[] args) {
        TestArrayService arrayService = new TestArrayService();
        arrayService.ifArrayContainsGivenNumber();
        arrayService.ifArrayContainsNoGivenNumber();
        arrayService.ifArrayContainsSimilarNumbers();
        arrayService.ifArrayContainsNoSimilarNumbers();
        arrayService.changingFirstElementInArray();
        arrayService.changingAllSimilarElementInArray();
        arrayService.massiveTurnOver();
        arrayService.arrayIsSorted();
    }

    ArrayService service = new ArrayService();

    void ifArrayContainsGivenNumber() {
        int[] arr = {1, -1, 3, 45, 3};
        int numberToSearch = 3;
        boolean contains = service.contains(arr, numberToSearch);
        if (contains) {
            System.out.println("Test has passed and matches numberToSearch = " + numberToSearch);
        } else {
            System.out.println("Out of methode service");
        }
    }

    void ifArrayContainsNoGivenNumber() {
        int[] arr = {1, -1, 3, 45, 3};
        int numberToSearch = 100;
        boolean contains = service.contains(arr, numberToSearch);
        if (!contains) {
            System.out.println("Test has passed. Array does not have numberToSearch");
        } else {
            System.out.println("Out of methode service");
        }
    }

    void ifArrayContainsSimilarNumbers() {
        int[] arr = {1, -1, 3, 45, 3};
        int expectedResult = 2;

        int realResult = service.countNumberOccurrences(arr);
        if (expectedResult == realResult) {
            System.out.println("Test is passed, expected result - " + expectedResult + " equals real result " + realResult);
        } else {
            System.out.println("Test false");
        }
    }

    void ifArrayContainsNoSimilarNumbers() {
        int[] arr = {1, -1, 33, 45, 3};
        int expectedResult = 2;

        int realResult = service.countNumberOccurrences(arr);
        if (expectedResult != realResult) {
            System.out.println("Test is passed, expected result no contains 2 expected similar numbers");
        } else {
            System.out.println("Test false");
        }
    }

    void changingFirstElementInArray() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, -1, 33, 45, 3};
        boolean ok = arrayService.replaceFirstNumberInArray(arr, -1, 100);
        if (ok && 100 == arr[1]) {
            System.out.println("Second element of massive- " + Arrays.toString(arr) + " replaced with 100.");
        } else {
            System.out.println("Found and replace first occurrence in array" + " = FAIL!");
        }

    }

    void changingAllSimilarElementInArray() {

        int[] arr = {3, -1, 3, 45, 3};
        service.replaceAllSimilarNumbers(arr, 3, 200);
        int[] changedMassive = {200, -1, 200, 45, 200};

        if (Arrays.equals(arr, changedMassive)) {
            System.out.println("All elements with number 3 of massive arr " + Arrays.toString(changedMassive) + " replaced with 200.");
        } else {
            System.out.println("hgjhg");
        }
    }

    void massiveTurnOver() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] revertArr = {5, 4, 3, 2, 1};

        service.revert(arr);

        if (Arrays.equals(arr, revertArr)) {

            System.out.println("Test is successfull, initial massive is reverted. New arr = " + Arrays.toString(arr));
        } else System.out.println("Test is no successfull");
    }

    void arrayIsSorted() {
        ArrayService service = new ArrayService();
        int[] arr = {4, 5, 2, -1, 33, 6};
        int[] sortedArray = {-1, 2, 4, 5, 6, 33};
        service.sort(arr);
        if (Arrays.equals(arr, sortedArray)) {
            System.out.println("Initial massive arr is sorted and = " + Arrays.toString(sortedArray));

        } else {
            System.out.println("Initial massive has not sorted");

        }
    }

}




