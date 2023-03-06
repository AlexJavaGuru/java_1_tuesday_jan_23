package student_daniels_belejuns.lesson_6.level_3.task_14;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.replaceFirstNumber();
        test.cantReplaceFirstNumber();
    }
    public void replaceFirstNumber() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        boolean expectedResult = true;
        boolean realResult = arrayService.replaceFirst(array, 10, 11);
        checkResult(realResult == expectedResult, "Replace first number test ");
    }
    public void cantReplaceFirstNumber() {
        ArrayService arrayService = new ArrayService();
        int[] array = {10, 12, 13, 14, 15};
        boolean expectedResult = true;
        boolean realResult = arrayService.replaceFirst(array, 10, 16);
        checkResult(realResult == !expectedResult, "Can't replace first number test ");
    }
    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
