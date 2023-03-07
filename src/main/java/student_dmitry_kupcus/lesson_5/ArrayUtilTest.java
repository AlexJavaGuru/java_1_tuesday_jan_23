package student_dmitry_kupcus.lesson_5;


class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] test = new int [11];
        int[] expectedResult = new int [11];
        int[] actualResult = arrayUtil.createArray(test.length);
        if (actualResult.length == expectedResult.length) {
            System.out.println("Test: Create array passed" + "\n");
        } else {
            System.out.println("Test: Create array failed" + "\n");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {1,2,3,4,5};
        int expectedResult = 4;
        int actualResult = arrayUtil.findMaxNumber(testArray);
        checkResult(expectedResult, actualResult, "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {5,6,7,8,9};
        int expectedResult = 7;
        int actualResult = arrayUtil.findMinNumber(testArray);
        checkResult(expectedResult, actualResult, "shouldFindMinNumber");
    }

    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test: " + testName + " has passed!" +"\n");
        } else {
            System.out.println("Test: " + testName + " failed!");
            System.out.println("Expected: " + expectedResult + ", but actual: " + actualResult +"\n");
        }
    }
}