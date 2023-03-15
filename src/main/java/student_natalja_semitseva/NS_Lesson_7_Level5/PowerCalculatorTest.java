package student_natalja_semitseva.NS_Lesson_7_Level5;


public class PowerCalculatorTest {
    public static void main(String[] args) {
     PowerCalculatorTest test = new PowerCalculatorTest();
     test.testCalculatePower();


    }


    public void testCalculatePower() {
        PowerCalculator test = new PowerCalculator();
        int expected = 8;
        float result = test.degree(2, 3);
        checkResults(expected, result, "degree");


    }

    public void checkResults(int expected, float result, String testName) {
        if (expected == result) {
            System.out.println(testName + " = TRUE");
        } else {
            System.out.println(testName + " = FALSE");

        }
    }
}