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
        int firstNumber = 13;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        checkResult(result == 21, "Sum test");
    }

    public void subTest() {
        int firstNumber = 6;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        checkResult(result == 1, "Sub test");
    }

    public void mulTest() {
        int firstNumber = 1;
        int secondNumber = 4;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        checkResult(result == 4, "Mul test");
    }

    public void divTest() {
        int firstNumber = 30;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        checkResult(result == 3, "Div test");
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
