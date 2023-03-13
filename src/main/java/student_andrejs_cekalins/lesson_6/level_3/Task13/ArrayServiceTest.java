package student_andrejs_cekalins.lesson_6.level_3.Task13;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.isCountOccurrencesInArray();
        test.noCountOccurrencesInArray();
    }

    public void isCountOccurrencesInArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {4, 10, 23, 5, 98, 33, 5, 25, 95};
        int expectedResult = 2;
        int realResult = arrayService.countOccurrences(array, 5);
        checkResult(realResult == expectedResult, "Is count of occurrences test ");
    }

    public void noCountOccurrencesInArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {4, 10, 23, 5, 98, 33, 5, 25, 95};
        int expectedResult = 0;
        int realResult = arrayService.countOccurrences(array, 3);
        checkResult(realResult == expectedResult, "No count of occurrences test ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}


