package student_dmitry_kupcus.lesson_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEven();
    }

    public void isEven() {
        int firstNumber = 10;
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(firstNumber);
        checkResult(result, "isEven test");
    }

    public void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test: " + testName + " has passed!");
        } else {
            System.out.println("Test: " + testName + " failed");
        }
    }
}
