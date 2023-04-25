package student_julija_raudive.lesson_7.level_5;

class PowerCalculatorTest {

    PowerCalculator calculator = new PowerCalculator();

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.raisingTwoToAPowerOfTwoTest();
        test.raisingFiveToAPowerOfEightTest();
        test.raisingThreeToAPowerOfOneTest();
        test.raisingTwoToAPowerOfZeroTest();
        test.raisingTwoToAPowerOfMinusTwoTest();
        test.raisingFractionalNumberToAPowerTest();

    }

    public void raisingTwoToAPowerOfTwoTest() {
        double realResult = calculator.raisingNumberToAPower(2, 2);
        double result = 4;
        checkResults(realResult == result, "2^2 test");

    }

    public void raisingFiveToAPowerOfEightTest() {
        double realResult = calculator.raisingNumberToAPower(5, 8);
        double result = 390625;
        checkResults(realResult == result, "5^8 test");

    }

    public void raisingThreeToAPowerOfOneTest() {
        double realResult = calculator.raisingNumberToAPower(3, 1);
        double result = 3;
        checkResults(realResult == result, "3^1 test");

    }

    public void raisingTwoToAPowerOfZeroTest() {
        double realResult = calculator.raisingNumberToAPower(2, 0);
        double result = 1;
        checkResults(realResult == result, "2^0 test");

    }

    public void raisingTwoToAPowerOfMinusTwoTest() {
        double realResult = calculator.raisingNumberToAPower(2, -2);
        double result = 0.25;
        checkResults(realResult == result, "2^-2 test");

    }

    public void raisingFractionalNumberToAPowerTest() {
        double realResult = calculator.raisingNumberToAPower(0.5, 10);
        double result = 0.0009765625;
        checkResults(realResult == result, "0,5^10 test");

    }


    void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
