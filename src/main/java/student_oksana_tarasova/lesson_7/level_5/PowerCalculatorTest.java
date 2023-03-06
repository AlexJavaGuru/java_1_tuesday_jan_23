package student_oksana_tarasova.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.exponentIsZero();
        test.raisingANumberToAPower();
        test.exponentiationOfANegativeNumber();
        test.raisingANumberToANegativePowerTest();
    }

    PowerCalculator powerCalculator = new PowerCalculator();

    public void exponentIsZero() {
        int number = 2;
        int powerOf = 0;
        int expectedResult = 1;
        int realResult = powerCalculator.raisingANumberToAPower(2, 0);
        checkResult(expectedResult == realResult, "exponentIsZero");

    }

    public void raisingANumberToAPower() {
        int number = 2;
        int powerOf = 3;
        int expectedResult = 8;
        int realResult = powerCalculator.raisingANumberToAPower(2, 3);
        checkResult(expectedResult == realResult, "raisingANumberToAPower");

    }

    public void exponentiationOfANegativeNumber() {
        int number = -2;
        int powerOf = 3;
        int expectedResult = -8;
        int realResult = powerCalculator.raisingANumberToAPower(-2, 3);
        checkResult(expectedResult == realResult, "exponentiation of a negative number");

    }

    public void raisingANumberToANegativePowerTest() {
        int number = 2;
        int powerOf = -3;
        double expectedResult = 0.125;
        double realResult = powerCalculator.raisingANumberToANegativePower(2, -3);
        checkResult(expectedResult == realResult, "raising a number to a negative power");

    }

    public void checkResult(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
