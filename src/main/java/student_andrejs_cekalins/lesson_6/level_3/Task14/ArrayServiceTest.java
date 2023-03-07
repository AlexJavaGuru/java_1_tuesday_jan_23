package student_andrejs_cekalins.lesson_6.level_3.Task14;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.replaceFirstNumber();
        test.cantReplaceFirstNumber();
    }

    public void replaceFirstNumber() {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 6, 12, 37, 58, 44, 17, 96, 74};
        boolean expectedResult = true;
        boolean realResult = arrayService.replaceFirst(array, 0, 5);
        checkResult(realResult == expectedResult, "Replace first number test ");
    }

    public void cantReplaceFirstNumber() {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 6, 12, 37, 58, 44, 17, 96, 74};
        boolean expectedResult = true;
        boolean realResult = arrayService.replaceFirst(array, 1, 5);
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
