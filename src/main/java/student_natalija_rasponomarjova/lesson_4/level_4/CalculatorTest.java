package student_natalija_rasponomarjova.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.evenNumberTest();
        calculatorTest.oddNumberTest();
        calculatorTest.number1BiggerTest();
        calculatorTest.number2BiggerTest();
        calculatorTest.numberEqualityTest();
        calculatorTest.number1BiggestFrom3Test();
        calculatorTest.number2BiggestFrom3Test();
        calculatorTest.number3BiggestFrom3Test();
        calculatorTest.number1and2EqualBiggerThan3Test();
        calculatorTest.allNumbersAreEqualTest();
        calculatorTest.number2and3EqualBiggerThan1Test();

    }

    public void testResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println("Test: " + testName + " OK");
        } else {
            System.out.println("Test: " + testName + " failed");
            System.out.println("Expected: " + expectedResult + ", but actual: " + realResult);
        }
    }

    public void testResult(boolean realResult, String testName) {
        if (realResult) {
            System.out.println("Test: " + testName + " is OK");
        } else {
            System.out.println("Test: " + testName + " FAILED");
        }
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int number1 = 20;
        int number2 = 5;
        int expectedResult = 25;
        int realResult = calculator.sum(number1, number2);

        testResult(expectedResult, realResult, "Sum");
    }

    public void subtractionTest() {
        int number1 = 20;
        int number2 = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(number1, number2);

        testResult(expectedResult, realResult, "Subtraction");
    }

    public void multiplicationTest() {
        int number1 = 3;
        int number2 = 10;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(number1, number2);

        testResult(expectedResult, realResult, "Multiplication");
    }

    public void divisionTest() {
        int number1 = 30;
        int number2 = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(number1, number2);

        testResult(expectedResult, realResult, "Division");
    }

    public void evenNumberTest() {
        int number = 88;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        testResult(realResult, "IsEven");
    }

    public void oddNumberTest() {
        int number = 77;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        testResult(!realResult, "IsOdd");
    }

    public void number1BiggerTest() {
        int number1 = 18;
        int number2 = 8;
        int realResult = 18;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfTwoNumbers(number1, number2);

        testResult(expectedResult, realResult, "Number 1 is the biggest -");

    }

    public void number2BiggerTest() {
        int number1 = 8;
        int number2 = 888;
        int realResult = 888;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfTwoNumbers(number1, number2);

        testResult(expectedResult, realResult, "Number 2 is the biggest -");
    }

    public void numberEqualityTest() {
        int number1 = 10;
        int number2 = 10;
        int realResult = 10;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfTwoNumbers(number1, number2);

        testResult(expectedResult, realResult, "Numbers are equal -");

    }

    public void number1BiggestFrom3Test() {
        int number1 = 80;
        int number2 = 70;
        int number3 = 30;
        int realResult = 80;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        testResult(expectedResult, realResult, "Number 1 is the biggest -");
    }

    public void number2BiggestFrom3Test() {
        int number1 = 80;
        int number2 = 170;
        int number3 = 30;
        int realResult = 170;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        testResult(expectedResult, realResult, "Number 2 is the biggest -");

    }

    public void number3BiggestFrom3Test() {
        int number1 = 80;
        int number2 = 170;
        int number3 = 300;
        int realResult = 300;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        testResult(expectedResult, realResult, "Number 3 is the biggest -");
    }

    public void number1and2EqualBiggerThan3Test() {
        int number1 = 30;
        int number2 = 30;
        int number3 = 15;
        int realResult = 30;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        testResult(expectedResult, realResult, "Number 1 and 2 are equal and bigger than number 3 -");
    }

    public void allNumbersAreEqualTest() {
        int number1 = 80;
        int number2 = 80;
        int number3 = 80;
        int realResult = 80;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        testResult(expectedResult, realResult, "3 numbers are equal -");
    }

    public void number2and3EqualBiggerThan1Test() {
        int number1 = 30;
        int number2 = 80;
        int number3 = 80;
        int realResult = 80;
        Calculator calculator = new Calculator();
        int expectedResult = calculator.maxOfThreeNumbers(number1, number2, number3);

            testResult(expectedResult, realResult, "Number 2 and 3 are equal and bigger than number 1 -");
        }
    }




