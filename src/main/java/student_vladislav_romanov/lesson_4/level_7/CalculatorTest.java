package student_vladislav_romanov.lesson_4.level_7;

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest(calculator);
        calculatorTest.subTest(calculator);
        calculatorTest.mulTest(calculator);
        calculatorTest.divTest(calculator);
        calculatorTest.isEvenTest1(calculator);
        calculatorTest.isEvenTest2(calculator);
    }

    public void sumTest(Calculator calculator) {
        int firstNumber = 35;
        int secondNumber = 40;
        printResult(calculator.sum(firstNumber, secondNumber), 75, "Sum");
    }

    public void subTest(Calculator calculator) {
        int firstNumber = 35;
        int secondNumber = 15;
        printResult(calculator.sub(firstNumber, secondNumber), 20, "Sub");
    }

    public void mulTest(Calculator calculator) {
        int firstNumber = 5;
        int secondNumber = 5;
        printResult(calculator.mul(firstNumber, secondNumber), 25, "Mul");
    }

    public void divTest(Calculator calculator) {
        int firstNumber = 40;
        int secondNumber = 8;
        printResult(calculator.div(firstNumber, secondNumber), 5, "Div");
    }

    public void isEvenTest1(Calculator calculator) {
        printResult(calculator.isEven(40), true, "isEven");
    }

    public void isEvenTest2(Calculator calculator) {
        printResult(calculator.isEven(41), false, "isEven");
    }

    public void printResult(int result, int expected, String test) {
        if (result == expected) {
            System.out.println(test + " test = OK");
        } else {
            System.out.println(test + " test = FAIL");
        }
    }

    public void printResult(boolean result, boolean expected, String test) {
        if (result == expected) {
            System.out.println(test + " test = OK");
        } else {
            System.out.println(test + " test = FAIL");
        }
    }
}
