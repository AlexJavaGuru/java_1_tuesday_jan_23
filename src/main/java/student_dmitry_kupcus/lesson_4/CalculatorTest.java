package student_dmitry_kupcus.lesson_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEven();

        calculatorTest.maxOfTwoNumbersTestFirstHigherThenSecond();
        calculatorTest.maxOfTwoNumbersTestSecondHigherThenFirst();
        calculatorTest.maxOfTwoNumbersEqual();

        calculatorTest.maxOfThreeNumbersFirstHigher();
        calculatorTest.maxOfThreeNumbersSecondHigher();
        calculatorTest.maxOfThreeNumbersThirdHigher();
        calculatorTest.maxOfThreeNumbersFirstAndSecondHigherThenThird();
        calculatorTest.maxOfThreeNumbersFirstAndThirdHigherThenSecond();
        calculatorTest.maxOfThreeNumbersSecondAndThirdHigherThenFirst();
        calculatorTest.maxOfThreeNumbersEqual();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "Sum");
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "Sub");
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "Div");
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "Mul");
    }

    public void isEven() {
        int firstNumber = 20;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        checkResult(result, "isEven test");
    }

    public void maxOfTwoNumbersTestSecondHigherThenFirst() {
        int firstNumber = 2;
        int secondNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(secondNumber, firstNumber);
        checkResult(expectedResult, realResult, "maxOfTwoNumbersTestSecondHigherThenFirst test");
    }

    public void maxOfTwoNumbersTestFirstHigherThenSecond() {
        int firstNumber = 3;
        int secondNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "maxOfTwoNumbersTestFirstHigherThenSecond test");
    }

    public void maxOfTwoNumbersEqual() {
        int firstNumber = 2;
        int secondNumber = 2;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "maxOfTwoNumbersEqual test");
    }

    public void maxOfThreeNumbersFirstHigher() {
        int firstNumber = 10;
        int secondNumber = 2;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult, "maxOfThreeNumbersFirstHigher test");
    }

    public void maxOfThreeNumbersSecondHigher() {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 5;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult, "maxOfThreeNumbersSecondHigher test");
    }

    public void maxOfThreeNumbersThirdHigher() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 50;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult, "maxOfThreeNumbersThirdHigher test");
    }

    public void maxOfThreeNumbersEqual() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult, "maxOfThreeNumbersEqualTest test");
    }

    public void maxOfThreeNumbersFirstAndSecondHigherThenThird() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult, "maxOfThreeNumbersFirstAndSecondHigherThenThird test");
    }

    public void maxOfThreeNumbersFirstAndThirdHigherThenSecond() {
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult, "maxOfThreeNumbersFirstAndThirdHigherThenSecond test");
    }

    public void maxOfThreeNumbersSecondAndThirdHigherThenFirst() {
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult, "maxOfThreeNumbersSecondAndThirdHigherThenFirst test");

    }

    public void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test: " + testName + " has passed!");
        } else {
            System.out.println("Test: " + testName + " failed");
        }
    }

    public void checkResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println("Test: " + testName + " has passed!");
        } else {
            System.out.println("Test: " + testName + " failed!");
            System.out.println("Expected: " + expectedResult + ", but actual: " + realResult);
        }
    }
}
