package student_nikita_visnakovs.lesson_5.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil util = new ArrayUtil();
        int expectedResult = 10;
        int[] testArray = util.createArray(expectedResult);
        int actualResult = testArray.length;
        checkResult(expectedResult, actualResult, "Should array test");

    }

    public void shouldFindMaxNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] testArray = {23, 255, 65, -23, 18, -99};
        int expectedResult = testArray[1];
        int actualResult = util.findMaxNumber(testArray);
        checkResult(expectedResult, actualResult, "Find max number test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] testArray = {12, 42, 52, -32, -33, 90};
        int expectedResult = testArray[4];
        int actualResult = util.findMinNumber(testArray);
        checkResult(expectedResult, actualResult, "Find min number test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + " has filed!!!");
        }
    }
}
