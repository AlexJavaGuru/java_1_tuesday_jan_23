package student_daniels_belejuns.lesson_6.level_3.task_12;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.numberToSearchIsInArray();
        test.numberToSearchIsNotInArray();
    }
    public void numberToSearchIsInArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        boolean expectedResult = true;
        boolean realResult = arrayService.contains(array, 10);
        checkResult(realResult == expectedResult, "Number to search is in the array test ");
    }
    public void numberToSearchIsNotInArray() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        boolean expectedResult = true;
        boolean realResult = arrayService.contains(array, 5);
        checkResult(realResult != expectedResult, "Number to search is not in the array test ");
    }
    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
