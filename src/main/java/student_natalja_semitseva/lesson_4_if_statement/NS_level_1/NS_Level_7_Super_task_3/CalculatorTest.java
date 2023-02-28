package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_7_Super_task_3;


public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();

    }

    public void sumTest() {
        int firstNumber = 25;
        int secondNumber = 25;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        checkResults(result == 50, "Test Sum");


    }

    public void subTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        checkResults(result == 20, "Test Sub");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        checkResults(result == 25, "Test Mul");
    }

    public void divTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        checkResults(result == 5, "Test Div");
    }

    public void isEvenTest() {
        int number = 50;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        checkResults(number == 50, "Test isEven");
    }


    private void checkResults(boolean number, String testName) {
        if (number) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");

        }
    }

}
