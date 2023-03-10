package student_oksana_tarasova.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.exponentIsZeroTest();
        test.raisingANumberToAPowerTest();
        test.exponentiationOfANegativeNumberTest();
        test.raisingANumberToANegativePowerTest();
    }

    PowerCalculator powerCalculator = new PowerCalculator();

    public void exponentIsZeroTest() {
        int expectedResult = 1;
        int realResult = powerCalculator.raisingANumberToAPower(2, 0);
        checkResult(expectedResult == realResult, "exponentIsZero");

    }

    public void raisingANumberToAPowerTest() {
        int expectedResult = 8;
        int realResult = powerCalculator.raisingANumberToAPower(2, 3);
        checkResult(expectedResult == realResult, "raisingANumberToAPower");

    }

    public void exponentiationOfANegativeNumberTest() {
        int expectedResult = -8;
        int realResult = powerCalculator.raisingANumberToAPower(-2, 3);
        checkResult(expectedResult == realResult, "exponentiation of a negative number");

    }

    public void raisingANumberToANegativePowerTest() {
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
