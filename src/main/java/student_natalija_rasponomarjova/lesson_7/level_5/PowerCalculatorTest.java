package student_natalija_rasponomarjova.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.checkPowerPositive();
        test.checkPowerNegative();
        test.checkPowerZero();
    }

    public void checkPowerPositive() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 27;
        double fact = powerCalculator.getPowerPositive(3, 3);
        printResult(expected == fact, "checkPowerPositive");
    }

    public void checkPowerNegative() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 0.001953125;
        double fact = powerCalculator.getPowerNegative(2, -10);
        printResult(expected == fact, "checkPowerNegative");
    }

    public void checkPowerZero() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 1.0;
        double fact = powerCalculator.getPowerPositive(2, 0);
        printResult(expected == fact, "checkPowerZero");
    }


    public void printResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " : " + "Test OK");
        } else {
            System.out.println(testName + " : " + "Test Failed");
        }
    }
}
