package student_vladislav_romanov.lesson_6.level_3;

class ArrayServiceTest {

    public static void main(String[] args) {
        containTestSucceed();
        containTestFailed();
        countOccurrencesTestSucceed();
        countOccurrencesTestFailed();
    }

    public static void containTestSucceed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 5, 7, 8, 9, 10};
        boolean expected = true;
        boolean current = arrayService.contain(array, 7);
        checkTestResult(current == expected, "containTestSucceed test");
    }

    public static void containTestFailed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 5, 7, 8, 9, 10};
        boolean expected = false;
        boolean current = arrayService.contain(array, 2);
        checkTestResult(current == expected, "containTestFailed test");
    }

    public static void countOccurrencesTestSucceed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 3, 7, 8, 3, 10, 3, 11, 2, 1, 3};
        int expected = 5;
        int current = arrayService.countOccurrences(array, 3);
        checkTestResult(current == expected, "countOccurrencesTestSucceed test");
    }

    public static void countOccurrencesTestFailed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 4, 7, 8, 3, 4, 3, 11, 2, 1, 3};
        int expected = 2;
        int current = arrayService.countOccurrences(array, 4);
        checkTestResult(current != expected, "countOccurrencesTestFailed test");
    }

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

}
