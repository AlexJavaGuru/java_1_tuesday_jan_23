package student_andrejs_cekalins.lesson_6.level_3.Task15;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.replaceAllNumbers();
        test.notReplaceAllNumbers();
    }
    public void replaceAllNumbers() {
        ArrayService arrayService = new ArrayService();
        int[] array = {3, 0, 2, 0, 6, 78, 15, 67};
        int expectedResult = 2;
        int realResult = arrayService.replaceAll(array,0,5);
        checkResult(realResult == expectedResult, "Can replace all numbers test ");
    }
    public void notReplaceAllNumbers() {
        ArrayService arrayService = new ArrayService();
        int[] array = {3, 0, 2, 0, 6, 78, 15, 67};
        int expectedResult = 0;
        int realResult = arrayService.replaceAll(array,4,7);
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
