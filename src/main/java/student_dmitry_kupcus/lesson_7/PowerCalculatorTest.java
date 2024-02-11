package student_dmitry_kupcus.lesson_7;

public class PowerCalculatorTest {
    public static void main(String[] args) {

        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.degreeTest();
    }

    public void degreeTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 125;
        int actualResult = powerCalculator.degree(5, 3);
        checkResult(expectedResult, actualResult, "degreeTest");
    }

    public void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }
}