package student_andrejs_cekalins.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.powerCheck();
        test.zeroPowerCheck();
        test.powerOfZeroCheck();
    }

    public void powerCheck() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = 5;
        int powerValue = 2;
        int expectedResult = 25;
        int realResult = powerCalculator.power(5, 2);
        checkResult(realResult, expectedResult, "Power check test");
    }

    public void zeroPowerCheck() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = 5;
        int powerValue = 0;
        int expectedResult = 1;
        int realResult = powerCalculator.power(5, 0);
        checkResult(realResult, expectedResult, "Zero power check test");
    }

    public void powerOfZeroCheck() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = 0;
        int powerValue = 3;
        int expectedResult = 0;
        int realResult = powerCalculator.power(0, 3);
        checkResult(realResult, expectedResult, "Power of zero check test");
    }

    private void checkResult(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}

