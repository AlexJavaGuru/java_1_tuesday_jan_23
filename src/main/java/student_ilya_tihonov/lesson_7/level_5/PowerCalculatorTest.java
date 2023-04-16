package student_ilya_tihonov.lesson_7.level_5;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testExponentiation();
    }

    public void testExponentiation(){
        PowerCalculator test = new PowerCalculator();
        int expectedResult = 4;
        int result = test.exponentiation(2, 2);
        testResult(expectedResult, result);
    }

    public void testResult (int expectedResult, int result){
        if (expectedResult == result){
            System.out.println("Test: OK");
        } else {
            System.out.println("Test: FALSE");
        }
    }


}
