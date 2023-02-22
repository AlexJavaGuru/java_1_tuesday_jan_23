package student_aleksandrs_lezhennikovs.lesson_6.level_3;

public class ArrayServiceTest {

    public static void main(String[] args) {

        trueTestSearchInArray();
        falseTestSearchInArray();
    }

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    static void trueTestSearchInArray() {

        int[] initArray = {4, 7, 10, 500, 35, 777};
        int findNumber = 35;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean calculatedResult = arrayService.isNumberInArray(initArray, findNumber);
        checkTestResult(expectedResult == calculatedResult, "True test search in array");
    }

    static void falseTestSearchInArray() {

        int[] initArray = {4, 7, 10, 500, 35, 777};
        int findNumber = 1000;
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean calculatedResult = arrayService.isNumberInArray(initArray, findNumber);
        checkTestResult(expectedResult == calculatedResult, "False test search in array");
    }

}
