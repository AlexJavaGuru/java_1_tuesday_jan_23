package student_andrejs_cekalins.lesson_4.level_7.Task_24;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEven(4);
    }

    public void sumTest() {
        double firstNumber = 13.6;
        double secondNumber = 8;
        Calculator calculator = new Calculator();
        double result = calculator.sum(firstNumber, secondNumber);
        checkResult(result == 21.6, "Sum test");
    }

    public void subTest() {
        double firstNumber = 6;
        double secondNumber = 5;
        Calculator calculator = new Calculator();
        double result = calculator.sub(firstNumber, secondNumber);
        checkResult(result == 1, "Sub test");
    }

    public void mulTest() {
        double firstNumber = 1.2;
        double secondNumber = 4;
        Calculator calculator = new Calculator();
        double result = calculator.mul(firstNumber, secondNumber);
        checkResult(result == 4.8, "Mul test");
    }

    public void divTest() {
        double firstNumber = 7;
        double secondNumber = 5;
        Calculator calculator = new Calculator();
        double result = calculator.div(firstNumber, secondNumber);
        checkResult(result == 1.4, "Div test");
    }

    public void isEven(int testValue) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(testValue);
        checkResult(result, "isEven test");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
