package student_vladislav_romanov.lesson_6.level_3;

class ArrayServiceTest {

    public static void main(String[] args) {
        containTestSucceed();
        containTestFailed();
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

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

}
