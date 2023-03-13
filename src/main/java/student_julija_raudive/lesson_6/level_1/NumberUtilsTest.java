package student_julija_raudive.lesson_6.level_1;

class NumberUtilsTest {
    NumberUtils test = new NumberUtils();

    public static void main(String[] args) {

        NumberUtilsTest test = new NumberUtilsTest();
        test.checkIfEven();
        test.checkIfOdd();

    }


    public void checkIfEven() {
        int number = 6;
        boolean result = test.isEven(number);
        checkResults(result, "Number is even");

    }

    public void checkIfOdd() {
        int number = 5;
        boolean result = test.isEven(number);
        checkResults(!result, "Number is odd");

    }


    public void checkResults(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + " test: OK");
        } else {
            System.out.println(testName + " test: FAIL");
        }
    }
}
