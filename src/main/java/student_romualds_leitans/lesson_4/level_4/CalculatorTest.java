package student_romualds_leitans.lesson_4.level_4;

class CalculatorTest {


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxOfThreeNumbers();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
    }

    public void maxOfThreeNumbers() {
        Calculator calculator = new Calculator();
        int number1 = 1;
        int number2 = 44;
        int number3 = 50;
        int expectedResult = 50;
        int actualResult = calculator.maxOFThreeNumbers(number1, number2, number3);
        if (expectedResult == actualResult) {
            System.out.println("TEST, Max of tree numbers = OK");
        } else {
            System.out.println("TEST, Max of tree numbers = FAIL");
        }
    }


    public void maxOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int firstNumber = 200;
        int secondNumber = 100;
        int expectedResult = 200;
        int result = calculator.maxOfTwoNumber(firstNumber, secondNumber);
        if (expectedResult == result) {
            System.out.println("TEST, Max of two numbers = OK");
        } else {
            System.out.println("TEST, Max of tho numbers = FAIL");
        }

    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        int number = 8;
        boolean realResult = calculator.isEven(number);
        if (realResult) {
            System.out.println("Even number = Test OK");
        } else {
            System.out.println("Not even number = Test FAIL");
        }
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 40;
        int expectedResult = 50;
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum Test is OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub Test is OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 9;
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul Test is OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum Test is OK");
        } else {
            System.out.println("Test failed");
        }
    }

}


