package student_natalija_rasponomarjova.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();
    int[] numbers = new int[]{2, 4, 6, 89, 3, 90, 23, 90, 45, 87, 90};

    public void containsTestOk() {
        boolean expected = true;
        boolean fact = arrayService.contains(numbers, 23);
        System.out.println("Test OK -" + " " + (fact == expected));
    }

    public void containsTestFailed() {
        boolean expected = false;
        boolean fact = arrayService.contains(numbers, 900);
        System.out.println("Test Failed -" + " " + (fact != expected));
    }

    public void countOccurrencesTestOk() {
        int target = 3;
        int fact = arrayService.countOccurrences(numbers, 90);
        System.out.println("Test OK -" + " " + (target == fact));
    }

    public void countOccurrencesTestFailed() {
        int target = 7;
        int fact = arrayService.countOccurrences(numbers, 90);
        System.out.println("Test Failed -" + " " + (target == fact));
    }

    public void replaceFirstTestOk() {
        boolean target = true;
        boolean fact = arrayService.replaceFirst(numbers, 2, 5);
        System.out.println("Test OK -" + " " + (fact == target));
    }

    public void replaceFirstTestFailed() {
        boolean target = true;
        arrayService.replaceFirst(numbers, 1, 5);
        System.out.println("Test Failed -" + " " + (!target));

    }

    public void replaceAllTestOk() {
        int target = 95;
        int fact = arrayService.replaceAll(numbers, 90, 95);
        System.out.println("Test OK -" + " " + (target == fact));
    }

    public void replaceAllTestFailed() {
        int target = 9;
        int fact = arrayService.replaceAll(numbers, 90, 95);
        System.out.println("Test Failed -" + " " + (target != fact));
    }

    public void reverseArrayTest() {
        int[] numbers = {2, 4, 6, 89, 3, 90, 23, 90, 45, 87, 90};
        int[] target = {90, 87, 45, 90, 23, 90, 3, 89, 6, 4, 2};
        arrayService.reverseArray(numbers);
        System.out.println("Reverse array test: " + Arrays.equals(target, numbers));

    }

    public void sortArrayTest() {
        int[] numbers = {95, 87, 45, 95, 23, 95, 3, 89, 6, 4, 5};
        int[] target = {3, 4, 5, 6, 23, 45, 87, 89, 95, 95, 95};
        arrayService.sortArray(numbers);
        System.out.println("Sorted array: " + Arrays.equals(target, numbers));

    }

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsTestOk();
        test.containsTestFailed();
        test.countOccurrencesTestOk();
        test.countOccurrencesTestFailed();
        test.replaceFirstTestOk();
        test.replaceFirstTestFailed();
        test.replaceAllTestOk();
        test.replaceAllTestFailed();
        test.reverseArrayTest();
        test.sortArrayTest();
    }
}


