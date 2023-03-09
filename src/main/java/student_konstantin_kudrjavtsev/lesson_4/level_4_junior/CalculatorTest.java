package student_konstantin_kudrjavtsev.lesson_4.level_4_junior;


class CalculatorTest {
    public static void main(String[] args) {
        testCalculatorSumTest();
        testCalculatorMinTest();
        testCalculatorMulTest();
        testCalculatorDivTest();
        testCalculatorIsEvenTest();
        testCalculatorIsOddTest();
        testMaxOfTwoNumbersTest();
        testMaxOfTwoNumbersTest2();
        testMaxOfTwoNumbersTest3();
        testMaxOfThreeNumbersTest1();
        testMaxOfThreeNumbersTest2();
        testMaxOfThreeNumbersTest3();
        testMaxOfThreeNumbersTest4();
        testMaxOfThreeNumbersTest5();
        testMaxOfThreeNumbersTest6();
        testMaxOfThreeNumbersTest7();
    }

    private static void testCalculatorSumTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 20;
        int actualResult = calculator.sum(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test Sum: " + "Test has passed");
        } else {
            System.out.println("Test Sum: " + "Test failed");
        }

    }

    private static void testCalculatorMinTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 0;
        int actualResult = calculator.min(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test minus: " + "Test has passed");
        } else {
            System.out.println("Test minus: " + "Test failed");
        }
    }

    private static void testCalculatorMulTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 100;
        int actualResult = calculator.mul(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test mul: " + "Test has passed");
        } else {
            System.out.println("Test mul: " + "Test failed");
        }
    }

    private static void testCalculatorDivTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 1;
        int actualResult = calculator.div(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test div: " + "Test has passed");
        } else {
            System.out.println("Test div: " + "Test failed");
        }
    }

    private static void testCalculatorIsEvenTest() {
        Calculator calculator = new Calculator();
        int number = 8;
        boolean actualResult = calculator.isEven(number);
        if (actualResult) {
            System.out.println("Test isEven: " + "Test has passed");
        } else {
            System.out.println("Test isEven: " + "Test failed");
        }
    }

    private static void testCalculatorIsOddTest() {
        Calculator calculator = new Calculator();
        int number = 9;
        boolean actualResult = calculator.isOdd(number);
        if (!actualResult) {
            System.out.println("Test isOdd: " + "Test has passed");
        } else {
            System.out.println("Test isOdd: " + "Test failed");
        }
    }

    private static void testMaxOfTwoNumbersTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 9;
        int secondNumber = 5;
        int expectedResult = 9;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "MaxOfTwoNumbers");
    }

    private static void testMaxOfTwoNumbersTest2() {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 9;
        int expectedResult = 9;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "MaxOfTwoNumbers2");
    }
    private static void testMaxOfTwoNumbersTest3() {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "MaxOfTwoNumbers3");
    }
    private static void testMaxOfThreeNumbersTest1() {
        Calculator calculator = new Calculator();
        int firstNumber = 12;
        int secondNumber = 5;
        int thirdNumber = 7;
        int expectedResult = 12;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumbers1");
    }
    private static void testMaxOfThreeNumbersTest2() {
        Calculator calculator = new Calculator();
        int firstNumber = 12;
        int secondNumber = 16;
        int thirdNumber = 7;
        int expectedResult = 16;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumbers2");
    }
    private static void testMaxOfThreeNumbersTest3() {
        Calculator calculator = new Calculator();
        int firstNumber = 12;
        int secondNumber = 5;
        int thirdNumber = 21;
        int expectedResult = 21;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumbers3");
    }
    private static void testMaxOfThreeNumbersTest4() {
        Calculator calculator = new Calculator();
        int firstNumber = 12;
        int secondNumber = 12;
        int thirdNumber = 7;
        int expectedResult = 12;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumbers4");
    }
    private static void testMaxOfThreeNumbersTest5() {
        Calculator calculator = new Calculator();
        int firstNumber = 12;
        int secondNumber = 23;
        int thirdNumber = 23;
        int expectedResult = 23;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumbers5");
    }
    private static void testMaxOfThreeNumbersTest6() {
        Calculator calculator = new Calculator();
        int firstNumber = 12;
        int secondNumber = 5;
        int thirdNumber = 12;
        int expectedResult = 12;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumbers6");
    }
    private static void testMaxOfThreeNumbersTest7() {
        Calculator calculator = new Calculator();
        int firstNumber = 37;
        int secondNumber = 37;
        int thirdNumber = 37;
        int expectedResult = 37;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumbers7");
    }
    private static void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test: " + testName + " Test has passed");
        } else {
            System.out.println("Test: " + testName + " Test failed");
            System.out.println("Expected: " + expectedResult + ",but actual: " + actualResult);
        }
    }
}