package student_nikita_visnakovs.lesson_4.level_4;


public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testSum();
        calculatorTest.testMinus();
        calculatorTest.testMulti();
        calculatorTest.testDiv();
        calculatorTest.testIsEven();
        calculatorTest.testIsEvenSecond();
        calculatorTest.testMaxOfTwoNumbersFirst();
        calculatorTest.testMaxOfTwoNumbersSecond();
        calculatorTest.testMaxOfThreeNumbersFirst();
        calculatorTest.testMaxOfThreeNumbersSecond();
        calculatorTest.testMaxOfThreeNumbersThird();
        calculatorTest.testMaxOfThreeNumbersFirstAndSecond();
        calculatorTest.testMaxOfThreeNumbersSecondAndThird();
        calculatorTest.testMaxOfThreeNumbersFirstAndThird();
        calculatorTest.testMaxOfThreeNumbersEquals();

    }

    public void testSum() {
        Calculator calculator = new Calculator();
        int fistNum = 10;
        int secondNumber = 12;
        int expectedResult = 22;
        int realResult = calculator.sum(fistNum, secondNumber);
        checkResult(realResult, expectedResult, "Sum test");
    }

    public void testMinus() {
        Calculator calculator = new Calculator();
        int fistNum = 20;
        int secondNumber = 10;
        int expectedResult = 10;
        int realResult = calculator.min(fistNum, secondNumber);
        checkResult(realResult, expectedResult, "Minus test");
    }

    public void testMulti() {
        Calculator calculator = new Calculator();
        int fistNum = 10;
        int secondNumber = 12;
        int expectedResult = 120;
        int realResult = calculator.multi(fistNum, secondNumber);
        checkResult(realResult, expectedResult, "Multi test");
    }

    public void testDiv() {
        Calculator calculator = new Calculator();
        int fistNum = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        int realResult = calculator.div(fistNum, secondNumber);
        checkResult(realResult, expectedResult, "Division test");
    }

    public void testIsEven() {
        Calculator calculator = new Calculator();
        int firstNum = 10;
        boolean realResult = calculator.isEven(firstNum);
        checkResult(realResult, "IsEven test");
    }

    public void testIsEvenSecond() {
        Calculator calculator = new Calculator();
        int firstNum = 9;
        boolean realResult = calculator.isEven(firstNum);
        checkResult(!realResult, "IsEvenSecond test");
    }

    public void testMaxOfTwoNumbersFirst() {
        Calculator calculator = new Calculator();
        int firstNum = 15;
        int secondNum = 10;
        int expectedResult = 15;
        int realResult = calculator.maxOfTwoNumbers(firstNum, secondNum);
        checkResult(realResult, expectedResult, "MaxOfTwoNumbersFirst test");
    }

    public void testMaxOfTwoNumbersSecond() {
        Calculator calculator = new Calculator();
        int firstNum = 10;
        int secondNum = 15;
        int expectedResult = 15;
        int realResult = calculator.maxOfTwoNumbers(firstNum, secondNum);
        checkResult(realResult, expectedResult, "MaxOfTwoNumbersSecond test");
    }

    public void testMaxOfThreeNumbersFirst() {
        Calculator calculator = new Calculator();
        int firstNum = 30;
        int secondNum = 20;
        int thirdNum = 10;
        int expectedResult = 30;
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        checkResult(realResult, expectedResult, "MaxOfThreeNumbersFirst test");
    }

    public void testMaxOfThreeNumbersSecond() {
        Calculator calculator = new Calculator();
        int firstNum = 20;
        int secondNum = 30;
        int thirdNum = 10;
        int expectedResult = 30;
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        checkResult(realResult, expectedResult, "MaxOfThreeNumbersSecond test ");
    }

    public void testMaxOfThreeNumbersThird() {
        Calculator calculator = new Calculator();
        int firstNum = 20;
        int secondNum = 10;
        int thirdNum = 30;
        int expectedResult = 30;
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        checkResult(realResult, expectedResult, "MaxOfThreeNumbersThirdTest test");
    }

    public void testMaxOfThreeNumbersFirstAndSecond() {
        Calculator calculator = new Calculator();
        int firstNum = 20;
        int secondNum = 20;
        int thirdNum = 10;
        int expectedResult = 20;
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        checkResult(realResult, expectedResult, "MaxOfThreeNumbersFirstAndSecond test");
    }

    public void testMaxOfThreeNumbersSecondAndThird() {
        Calculator calculator = new Calculator();
        int firstNum = 10;
        int secondNum = 20;
        int thirdNum = 20;
        int expectedResult = 20;
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        checkResult(realResult, expectedResult, "MaxOfThreeNumbersSecondAndThird test");
    }

    public void testMaxOfThreeNumbersFirstAndThird() {
        Calculator calculator = new Calculator();
        int firstNum = 30;
        int secondNum = 20;
        int thirdNum = 30;
        int expectedResult = 30;
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        checkResult(realResult, expectedResult, "MaxOfThreeNumbersFirstAndThird test");
    }

    public void testMaxOfThreeNumbersEquals() {
        Calculator calculator = new Calculator();
        int firstNum = 10;
        int secondNum = 10;
        int thirdNum = 10;
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        checkResult(expectedResult, realResult, "MaxOfThreeNumbersEquals test");
    }

    public void checkResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but " + "actual result is " + realResult);
        }
    }

    public void checkResult(boolean realResult, String testName) {
        if (realResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + true + " but real result is " + realResult);
        }
    }
}

