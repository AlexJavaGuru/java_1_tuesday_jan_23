package student_aleksandrs_lezhennikovs.lesson_7.level_5;

import java.util.Arrays;

class PowerCalculatorTest {
    public static void main(String[] args) {
        checkPower();
        checkZeroPower();
        checkZeroNumber();
    }

    public static void checkPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 10000;
        int calculatedResult = powerCalculator.power(10, 4);
        check("Power method", expectedResult, calculatedResult);
    }

    public static void checkZeroPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 1;
        int calculatedResult = powerCalculator.power(10, 0);
        check("Zero power method", expectedResult, calculatedResult);
    }

    public static void checkZeroNumber() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 0;
        int calculatedResult = powerCalculator.power(0, 10);
        check("Zero number method", expectedResult, calculatedResult);
    }

    public static void check(String actionName, int expect, int actual) {
        if (expect == actual) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
