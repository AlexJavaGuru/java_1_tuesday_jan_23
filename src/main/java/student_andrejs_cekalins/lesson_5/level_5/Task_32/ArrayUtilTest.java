package student_andrejs_cekalins.lesson_5.level_5.Task_32;

import student_andrejs_cekalins.lesson_5.level_5.Task_31.ArrayUtil;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 10;
        int[] createArray = arrayUtil.createArray(expectedResult);
        int realResult = createArray.length;
        checkResult(realResult, expectedResult, "Create array test");
    }

    private void checkResult(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
