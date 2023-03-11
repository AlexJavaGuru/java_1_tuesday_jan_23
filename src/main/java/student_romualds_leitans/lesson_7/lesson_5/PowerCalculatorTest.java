package student_romualds_leitans.lesson_7.lesson_5;

import student_romualds_leitans.lesson_7.lesson_6.PalindromeTest;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.positivePower();
        test.negativePower();
        test.zeroPower();

    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + "= OK");
        } else System.out.println(testName + "= FAIL");
    }

    public void positivePower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberPower(2, 2);
        double expectedResult = 4;
        checkResult(actualResult, expectedResult, "Positive number in power test");
    }

    public  void negativePower(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberPower(2, -2);
        double expectedResult = 0.25;
        checkResult(actualResult, expectedResult, "Negative number in power test");
    }
    public void zeroPower(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberPower(2, 0);
        double expectedResult = 1;
        checkResult(actualResult, expectedResult, "Zero number in power test");
    }
}

