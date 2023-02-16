package student_dmitry_kupcus.lesson_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEven();

        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumbersEqualTest();

        calculatorTest.maxOfThreeNumbers();
        calculatorTest.maxOfThreeNumbersEqualTest();

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
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "Div");
    }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "Mul");
    }
    public void isEven() {
        Calculator calculator = new Calculator();
        int firstNumber = 20;
        boolean result = calculator.isEven(firstNumber);
        checkResult(result, "isEven test");
    }
    public void maxOfTwoNumbersTest() {
        int firstNumber = 2;
        int secondNumber = 2;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, realResult, "maxOfTwoNumbers test");
    }
    public void maxOfTwoNumbersEqualTest() {
        int firstNumber = 2;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == firstNumber && realResult == secondNumber) {
            System.out.println("Test: maxOfThoNumbersEqual = both numbers are equal");
        } else if (firstNumber != secondNumber) {
            System.out.println("Test: maxOfThoNumbersEqual = both numbers are not equal");
        }
    }
    public void maxOfThreeNumbers(){
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, realResult,"maxOfThreeNumbers test");
    }
    public void maxOfThreeNumbersEqualTest() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == firstNumber && realResult == secondNumber && realResult == thirdNumber) {
            System.out.println("Test: maxOfThreeNumbersEqual = all three numbers are equal!");
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Test: maxOfThreeNumbersEqual = First number are higher then second and third!");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Test: maxOfThreeNumbersEqual = Second number are higher then first and third!");
        } else if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.println("Test: maxOfThreeNumbersEqual = Third number are higher then first and second!");
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber) {
            System.out.println("Test: maxOfThreeNumbersEqual = First number is equal to second number and both are higher then third!");
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber && thirdNumber > firstNumber) {
            System.out.println("Test: maxOfThreeNumbersEqual = Second number is equal to third number and both are higher then first!");
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber && thirdNumber > secondNumber) {
            System.out.println("Test: maxOfThreeNumbersEqual = First number is equal to third number and both are higher then second!");
        } else {
            System.out.println("Test: maxOfThreeNumbersEqual test failed!");
        }
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
