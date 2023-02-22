package student_vladislav_romanov.lesson_6.level_3;

class ArrayServiceTest {

    public static void main(String[] args) {
        containTestSucceed();
        containTestFailed();
        countEntriesTestSucceed();
        countEntriesTestFailed();
        replaceFirstEntryTestSucceed();
        replaceFirstEntryTestFailed();
        replaceAllEntriesTestSucceed();
        replaceAllEntriesTestFailed();
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

    public static void countEntriesTestSucceed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 3, 7, 8, 3, 10, 3, 11, 2, 1, 3};
        int expected = 5;
        int current = arrayService.countEntries(array, 3);
        checkTestResult(current == expected, "countEntriesTestSucceed test");
    }

    public static void countEntriesTestFailed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 4, 7, 8, 3, 4, 3, 11, 2, 1, 3};
        int expected = 2;
        int current = arrayService.countEntries(array, 4);
        checkTestResult(current != expected, "countEntriesTestFailed test");
    }

    public static void replaceFirstEntryTestSucceed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 3, 7, 8, 3, 10, 3, 11, 2, 1, 3};
        boolean expected = true;
        boolean current = arrayService.replaceFirstEntry(array, 4, 22);
        checkTestResult(current == expected, "replaceFirstEntryTestSucceed test");
    }

    public static void replaceFirstEntryTestFailed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 4, 7, 8, 3, 4, 3, 11, 2, 1, 3};
        boolean expected = false;
        boolean current = arrayService.replaceFirstEntry(array, 22, 11);
        checkTestResult(current == expected, "replaceFirstEntryTestFailed test");
    }

    public static void replaceAllEntriesTestSucceed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 3, 7, 8, 3, 10, 3, 11, 2, 1, 3};
        int expected = 5;
        int current = arrayService.replaceAllEntries(array, 3, 22);
        checkTestResult(current == expected, "replaceAllEntriesTestSucceed test");
    }

    public static void replaceAllEntriesTestFailed() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 3, 4, 4, 7, 8, 3, 4, 3, 11, 2, 1, 3};
        int expected = 0;
        int current = arrayService.replaceAllEntries(array, 22, 11);
        checkTestResult(current == expected, "replaceAllEntriesTestFailed test");
    }

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

}
