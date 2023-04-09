package student_oksana_tarasova.lesson_6.level_3;


import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containNumberInTheArrayTest();
        test.containNumberInTheArrayTest1();
        test.countOccurrencesTest();
        test.countOccurrencesTest1();
        test.replaceNumberTest();
        test.replaceNumberTest1();
        test.replaceAllNumbersTest();
        test.replaceAllNumbersTest1();
        test.flipArrayTest();
    }

    public void containNumberInTheArrayTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 10, 5, 6, 7, 8, 9};
        boolean expectedResult = true;
        boolean realResult = arrayService.containsTheGivenNumberInTheArray(array, 10);

        check(expectedResult == realResult, "containNumberInTheArray");

    }

    public void containNumberInTheArrayTest1() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 6, 8, 5, 1, 8, 9, 10};
        boolean expectedResult = false;
        boolean realResult = arrayService.containsTheGivenNumberInTheArray(array, 7);

        check(expectedResult == realResult, "containNumberInTheArray");

    }

    public void countOccurrencesTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 6, 8, 5, 1, 8, 9, 10};
        int expectedResult = 2;
        int realResult = arrayService.countOccurrences(array, 8);

        checkInt("countOccurrences", expectedResult, realResult);
    }

    public void countOccurrencesTest1() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 6, 8, 5, 1, 8, 9, 10};
        int expectedResult = 0;
        int realResult = arrayService.countOccurrences(array, 7);

        checkInt("countOccurrences", expectedResult, realResult);
    }

    public void replaceNumberTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 6, 8, 5, 1, 8, 9, 10};
        boolean expectedResult = true;
        boolean realResult = arrayService.replaceNumber(array, 8, 12);

        check(expectedResult == realResult, "replaceNumber");
    }

    public void replaceNumberTest1() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 6, 8, 5, 1, 8, 9, 10};
        boolean expectedResult = false;
        boolean realResult = arrayService.replaceNumber(array, 7, 12);

        check(expectedResult == realResult, "replaceNumber");
    }

    public void replaceAllNumbersTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 8, 8, 5, 1, 8, 9, 10};
        boolean expectedResult = true;
        boolean realResult = arrayService.replaceAllNumbers(array, 8, 12);

        check(expectedResult == realResult, "replaceAllNumber");

    }

    public void replaceAllNumbersTest1() {
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 8, 8, 5, 1, 8, 9, 10};
        boolean expectedResult = false;
        boolean realResult = arrayService.replaceAllNumbers(array, 0, 12);

        check(expectedResult != realResult, "replaceAllNumber");

    }

    public void flipArrayTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedResult = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] realResult = arrayService.flipArray(array);


        check(Arrays.equals(expectedResult, realResult), "flipArray");
    }

    void check(boolean state, String methodName) {
        if (state) {
            System.out.println(methodName + " = ok");
        } else {
            System.out.println(methodName + " = fail");
        }
    }

    public void checkInt(String methodName, int expectedResult, int realResult) {
        if (expectedResult == realResult) {
            System.out.println(methodName + " = ok");
        } else {
            System.out.println(methodName + " = fail");
        }
    }
}
