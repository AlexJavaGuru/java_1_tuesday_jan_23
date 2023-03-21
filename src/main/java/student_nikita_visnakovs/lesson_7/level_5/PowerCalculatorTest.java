package student_nikita_visnakovs.lesson_7.level_5;


public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest tester = new PowerCalculatorTest();
        tester.testRaisePositivePower();

    }

    public void testRaisePositivePower() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = 4;
        double actualResult = calculator.raisePower(2, 2);
        checkResult(expectedResult , actualResult , "Raise to positive test");



    }
    private void checkResult(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
