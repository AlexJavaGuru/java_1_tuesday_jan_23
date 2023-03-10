package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_4;


class CalculatorTest {
    public static void main(String[] args) {
        testCalculatorSumTest();
        testCalculatorMulTest();
        testCalculatorSubtractTest();
        testCalculatorDivideTest();
        testCalculatorIsEvenTest();
        testCalculatorIsOddTest();
        testMaxOfTwoNumbersTest();
        testMaxOfTwoNumbersTest1();
        testMaxOfTwoNumbersTest2();
        testMaxOfThreeNumbersTest();
        testMaxOfThreeNumbersTest1();
        testMaxOfThreeNumbersTest2();
        testMaxOfThreeNumbersTest3();

    }

    public static void testCalculatorSumTest() {

        Calculator calculator = new Calculator();
        int firstNumberA = 15;
        int secondNumberB = 15;
        int expectedResult = 30;
        int realResult = calculator.sum(firstNumberA, secondNumberB);
        checkResult(realResult, expectedResult, "Sum");
    }

    private static void testCalculatorMulTest() {

        Calculator calculator = new Calculator();
        int firstNumberA = 2;
        int secondNumberB = 5;
        int expectedResult = 10;
        int realResult = calculator.mul(firstNumberA, secondNumberB);
        checkResult(realResult, expectedResult, "Mul");
    }

    private static void testCalculatorSubtractTest() {

        Calculator calculator = new Calculator();
        int firstNumberA = 20;
        int secondNumberB = 10;
        int expectedResult = 10;
        int realResult = calculator.subtract(firstNumberA, secondNumberB);
        checkResult(realResult, expectedResult, "Subtract");
    }

    private static void testCalculatorDivideTest() {

        Calculator calculator = new Calculator();
        int firstNumberA = 20;
        int secondNumberB = 2;
        int expectedResult = 10;
        double realResult = calculator.divide(firstNumberA, secondNumberB);
        checkResult(realResult, expectedResult, "Test Divide ");
    }

    private static void testCalculatorIsEvenTest() {
        Calculator calculator = new Calculator();
        int firstNumberA = 8;
        boolean realResult = calculator.isEven(firstNumberA);
        if (realResult) {
            System.out.println("Test isOdd = True");
        } else {
            System.out.println("Test isOdd = False");
        }
    }

    private static void testCalculatorIsOddTest() {

        Calculator calculator = new Calculator();
        int firstNumberA = 9;
        boolean realResult = calculator.isEven(firstNumberA);
        if (!realResult) {
            System.out.println("Test isOdd successful");
        } else {
            System.out.println("Test isOdd failed");
        }
    }

    private static void testMaxOfTwoNumbersTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 5;
        int secondNumber = 6;
        int expectedResult = 6;
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test MaxOfTwoNumbers has passed");
        } else {
            System.out.println("Test MaxOfTwoNumbers failed");
        }
    }

    private static void testMaxOfTwoNumbersTest1() {
        Calculator calculator = new Calculator();

        int firstNumber = 6;
        int secondNumber = 7;
        int expectedResult = 7;
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == expectedResult) {
            checkResult(result, expectedResult, " Test max of two numbers");
        }
    }

    private static void testMaxOfTwoNumbersTest2() {
        Calculator calculator = new Calculator();

        int firstNumber = 6;
        int secondNumber = 6;
        int expectedResult = 6;
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("TestTest equally of two numbers has passed");
        } else {
            System.out.println("Test Test equally of two numbers failed");
        }
    }

    private static void testMaxOfThreeNumbersTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 7;
        int secondNumber = 2;
        int thirdNumber = 4;
        int expectedResult = 8;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result != expectedResult) {
            System.out.println("Test ThreeMax = true");
        } else {
            System.out.println("Test ThreeMax = False");
        }
    }

    private static void testMaxOfThreeNumbersTest1() {
        Calculator calculator = new Calculator();

        int firstNumber = 7;
        int secondNumber = 10;
        int thirdNumber = 4;
        int expectedResult = 10;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("Test ThreeMax1 = true");
        } else {
            System.out.println("Test ThreeMax1 = False");
        }
    }

    private static void testMaxOfThreeNumbersTest2() {
        Calculator calculator = new Calculator();

        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 12;
        int expectedResult = 12;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("Test ThreeMax2 = true");
        } else {
            System.out.println("Test ThreeMax2 = False");
        }
    }

    private static void testMaxOfThreeNumbersTest3() {
        Calculator calculator = new Calculator();

        int firstNumber = 12;
        int secondNumber = 11;
        int thirdNumber = 13;
        int expectedResult = 13;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == expectedResult) {
            System.out.println("Test ThreeMax3 = true");
        } else {
            System.out.println("Test ThreeMax3 = False");
        }
    }

    private static void checkResult(boolean realResult, String testName) {
        if (realResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " has passed!");
        }
    }

    private static void checkResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " has passed!");
            System.out.println("Expected " + realResult + ", but actual:" + expectedResult);
        }
    }

    private static void checkResult(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " has passed!");
            System.out.println("Expected " + realResult + ", but actual:" + expectedResult);
        }
    }
}



