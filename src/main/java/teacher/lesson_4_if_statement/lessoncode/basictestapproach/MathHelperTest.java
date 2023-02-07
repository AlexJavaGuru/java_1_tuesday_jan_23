package teacher.lesson_4_if_statement.lessoncode.basictestapproach;

public class MathHelperTest {

    private static final String SOME_THING = "Hey, it's a constant";

    public static void main(String[] args) {
        MathHelperTest mathHelperTest = new MathHelperTest();
        mathHelperTest.testMathSumTest();
        mathHelperTest.testMathMulTest();
        mathHelperTest.testMathIsEvenIfArgumentIsEvenTest();
        mathHelperTest.testMathIsEvenIfArgumentIsOddTest();
    }

    public void testMathSumTest() {
        MathHelper mathHelper = new MathHelper();
        int varA = 10;
        int varB = 30;
        int expectedResult = 40;
        int actualResult = mathHelper.sum(varA, varB);
        checkResult(expectedResult, actualResult, "Sum");
    }

    public void testMathMulTest() {
        MathHelper mathHelper = new MathHelper();
        int varA = 4;
        int varB = 2;
        int expectedResult = 8;
        int actualResult = mathHelper.mul(varA, varB);

        checkResult(expectedResult, actualResult, "Mul");

    }

    public void testMathIsEvenIfArgumentIsEvenTest() {
        MathHelper mathHelper = new MathHelper();
        int varA = 4;
        boolean actualResult = mathHelper.isEven(varA);

        checkResult(actualResult, "Is Even");
    }

    public void testMathIsEvenIfArgumentIsOddTest() {
        MathHelper mathHelper = new MathHelper();
        int varA = 9;
        boolean actualResult = mathHelper.isEven(varA);

        checkResult(!actualResult, "Is Odd");
    }

    public void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test: " + testName + " has passed!");
        } else {
            System.out.println("Test: " + testName + " failed!");
        }
    }

    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test: " + testName + " has passed!");
        } else {
            System.out.println("Test: " + testName + " failed!");
            System.out.println("Expected: " + expectedResult + ", but actual: " + actualResult);
        }
    }
}
