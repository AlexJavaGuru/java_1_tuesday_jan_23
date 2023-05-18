package student_natalija_rasponomarjova.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.copyInRangeTest();
        test.newArrayLengthTest();

    }

    void copyInRangeTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {8, 9, 10};
        int[] fact = arrayCopy.copyInRange(numbers, 8, 10);
        testResults(Arrays.equals(expected, fact));

    }

    public void newArrayLengthTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] numbers = {1, 2, 3};
        int expected = 3;
        int fact = arrayCopy.newArrayLength(numbers, 1, 3);
        testResults(expected == fact);
    }

    public void testResults(boolean condition) {
        if (condition) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }
}


