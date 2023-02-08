package student_vladislav_romanov.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.evenTest();
        calculatorTest.oddTest();
        calculatorTest.firstNumberMaxTest();
        calculatorTest.secondNumberMaxTest();
        calculatorTest.equalNumbersMaxTest();
    }

    void sumTest() {
        int firstNumber = 4;
        int secondNumber = 3;
        int expectedResult = 7;

        Calculator calculator = new Calculator();

        int actualResult = calculator.sum(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("Sum test PASSED");
        } else {
            System.out.println("Sum test FAILED");
        }
    }

    void subTest() {
        int firstNumber = 8;
        int secondNumber = 4;
        int expectedResult = 4;

        Calculator calculator = new Calculator();

        int actualResult = calculator.sub(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("Subtraction test PASSED");
        } else {
            System.out.println("Subtraction test FAILED");
        }
    }

    void mulTest() {
        int firstNumber = 4;
        int secondNumber = 6;
        int expectedResult = 24;

        Calculator calculator = new Calculator();

        int actualResult = calculator.mul(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("Multiplication test PASSED");
        } else {
            System.out.println("Multiplication test FAILED");
        }
    }

    void divTest() {
        int firstNumber = 35;
        int secondNumber = 7;
        int expectedResult = 5;

        Calculator calculator = new Calculator();

        int actualResult = calculator.div(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("Division test PASSED");
        } else {
            System.out.println("Division test FAILED");
        }
    }

    void evenTest() {
        int number = 6;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();

        boolean actualResult = calculator.isEven(number);

        if (actualResult == expectedResult) {
            System.out.println("isEven Even case test PASSED");
        } else {
            System.out.println("isEven Even case test FAILED");
        }
    }

    void oddTest() {
        int number = 3;
        boolean expectedResult = false;

        Calculator calculator = new Calculator();

        boolean actualResult = calculator.isEven(number);

        if (actualResult == expectedResult) {
            System.out.println("isEven Odd case test PASSED");
        } else {
            System.out.println("isEven Odd case test FAILED");
        }
    }

    void firstNumberMaxTest() {
        int firstNumber = 7;
        int secondNumber = 3;
        int expectedResult = 7;

        Calculator calculator = new Calculator();

        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfTwoNumbers first number case test PASSED");
        } else {
            System.out.println("maxOfTwoNumbers first number case test FAILED");
        }
    }

    void secondNumberMaxTest() {
        int firstNumber = 2;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();

        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfTwoNumbers second number case test PASSED");
        } else {
            System.out.println("maxOfTwoNumbers second number case test FAILED");
        }
    }

    void equalNumbersMaxTest() {
        int firstNumber = 4;
        int secondNumber = 4;
        int expectedResult = 4;

        Calculator calculator = new Calculator();

        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfTwoNumbers equal case test PASSED");
        } else {
            System.out.println("maxOfTwoNumbers equal case test FAILED");
        }
    }

}
