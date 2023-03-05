package student_vladislav_romanov.lesson_7.level_5;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.powIntegerSuccess();
        powerCalculatorTest.powIntegerFailed();
        powerCalculatorTest.powDoubleSuccess();
        powerCalculatorTest.powDoubleFailed();
    }

    public void powIntegerSuccess() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 8;
        double current = powerCalculator.pow(2, 3);
        printResult(current == expected, "powIntegerSuccess");
    }

    public void powIntegerFailed() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 9;
        double current = powerCalculator.pow(3, 3);
        printResult(current != expected, "powIntegerFailed");
    }

    public void powDoubleSuccess() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 15.625;
        double current = powerCalculator.pow(2.5, 3);
        printResult(current == expected, "powDoubleSuccess");
    }

    public void powDoubleFailed() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 50.6;
        double current = powerCalculator.pow(3.7, 3);
        printResult(current != expected, "powDoubleFailed");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
        } else {
            System.out.println(test + " test FAILED");
        }
    }

}
