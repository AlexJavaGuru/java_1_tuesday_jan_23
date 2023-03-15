package student_daniels_belejuns.lesson_6.level_3.task_15;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.replaceAllNumbers();
        test.notReplaceAllNumbers();
    }
    public void replaceAllNumbers() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        int expectedResult = 2;
        int realResult = arrayService.replaceAll(array,11,13);
        checkResult(realResult == expectedResult, "Can replace all numbers test ");
    }
    public void notReplaceAllNumbers() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        int expectedResult = 0;
        int realResult = arrayService.replaceAll(array,11,13);
        checkResult(realResult == expectedResult, "Can't replace all numbers test ");
    }
    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
