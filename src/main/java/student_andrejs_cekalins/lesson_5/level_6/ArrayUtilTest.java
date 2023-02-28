package student_andrejs_cekalins.lesson_5.level_6;


import student_andrejs_cekalins.lesson_5.level_5.ArrayUtil;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 10;
        int[] createArray = arrayUtil.createArray(expectedResult);
        int realResult = createArray.length;
        checkResult(realResult, expectedResult, "Create array test");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] maxArray = {20, 60, 90, 6};
        int expectedResult = maxArray[2];
        int realResult = arrayUtil.findMaxNumber(maxArray);
        checkResult(realResult, expectedResult, "Max number array test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] minArray = {12, 90, 55, 3, 10};
        int expectedResult = minArray[3];
        int realResult = arrayUtil.findMinNumber(minArray);
        checkResult(realResult, expectedResult, "Min number array test");
    }

    private void checkResult(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}