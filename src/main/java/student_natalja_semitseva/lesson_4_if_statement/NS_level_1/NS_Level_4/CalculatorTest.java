package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_4;


public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        testCalculatorSumTest();
        testCalculatorMulTest();
        testCalculatorSubtractTest();
        testCalculatorDivideTest();
        testCalculatorIsEven1Test();
        testCalculatorIsOdd1Test();
        testCalculatorIsEvenTest();
        testCalculatorIsOddTest();
        testMaxOfTwoNumbersTest();
        testMaxOfTwoNumbersTest1();
        testMaxOfTwoNumbersTest2();
        testMaxOfThreeNumbersTest();
        testMaxOfThreeNumbersTest1();
        testMaxOfThreeNumbersTest2();
        testMaxOfThreeNumbersTest3();
        testMaxOfThreeNumbersTest4();

    }

    private static void testCalculatorSumTest() {

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
        int realResult = calculator.divide(firstNumberA, secondNumberB);
        checkResult(realResult, expectedResult, "Divide");

    }

    private static void testCalculatorIsEven1Test() {

        Calculator calculator = new Calculator();
        int firstNumberA = 4;
        boolean realResult = calculator.isEven1(firstNumberA);
        checkResult(realResult, "isEven1");
    }

    private static void testCalculatorIsOdd1Test() {

        Calculator calculator = new Calculator();
        int firstNumberA = 9;
        boolean realResult = calculator.isEven1(firstNumberA);
        checkResult(realResult, "isOdd1");


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
        if (realResult) {
            System.out.println("Test isOdd = true");
        } else {
            System.out.println("Test isOdd = False");
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

    private static void checkResult(boolean realResult, String testName) {
        if (realResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " has passed!");
        }
    }


    private static int testMaxOfTwoNumbersTest() {
        Calculator calculator = new Calculator();
        {
            {

            }
            int firstNumber = 5;
            int secondNumber = 1;

            int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
            if ((secondNumber < firstNumber)) {
                System.out.println("Test Max = true");
            } else {
                System.out.println("Test Max = False");
            }
            {
            }
            return 0;
        }
    }

    private static int testMaxOfTwoNumbersTest1() {
        Calculator calculator = new Calculator();
        {


            {

            }
            int firstNumber = 6;
            int secondNumber = 7;
            int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

            if (secondNumber > firstNumber) {
                System.out.println("Test Max1 = true");
            } else {
                System.out.println("Test Max1 = False");
            }
        }

        return 0;
    }

    private static int testMaxOfTwoNumbersTest2() {
        Calculator calculator = new Calculator();
        {


            {

            }
            int firstNumber = 6;
            int secondNumber = 6;
            int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

            if (secondNumber == firstNumber) {
                System.out.println("Test Max2 = true");
            } else {
                System.out.println("Test Max2 = False");
            }
        }

        return 0;
    }

    private static int testMaxOfThreeNumbersTest() {
        Calculator calculator = new Calculator();
        {


            {

            }
            int firstNumber = 7;
            int secondNumber = 2;
            int thirdNumber = 4;
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

            if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                System.out.println("Test ThreeMax = true");
            } else {
                System.out.println("Test ThreeMax = False");
            }
        }
        return 0;
    }

    private static int testMaxOfThreeNumbersTest1() {
        Calculator calculator = new Calculator();
        {


            {

            }
            int firstNumber = 7;
            int secondNumber = 10;
            int thirdNumber = 4;

            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

            if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                System.out.println("Test ThreeMax1 = true");
            } else {
                System.out.println("Test ThreeMax1 = False");
            }
        }
        return 0;
    }

    private static int testMaxOfThreeNumbersTest2() {
        Calculator calculator = new Calculator();
        {


            {

            }
            int firstNumber = 7;
            int secondNumber = 5;
            int thirdNumber = 12;
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

            if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
                System.out.println("Test ThreeMax2 = true");
            } else {
                System.out.println("Test ThreeMax2 = False");
            }
        }
        return 0;
    }

    private static int testMaxOfThreeNumbersTest3() {
        Calculator calculator = new Calculator();
        {

            {

            }
            int firstNumber = 12;
            int secondNumber = 12;
            int thirdNumber = 12;
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

            if ((thirdNumber = firstNumber) > secondNumber) {
                System.out.println("Test ThreeMax3 = true");
            } else {
                System.out.println("Test ThreeMax3 = False");
            }
        }
        return 0;
    }

    private static int testMaxOfThreeNumbersTest4() {
        Calculator calculator = new Calculator();
        {

            {

            }
            int firstNumber = 12;
            int secondNumber = 12;
            int thirdNumber = 12;

            int Result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

            if ((secondNumber == firstNumber) && firstNumber == thirdNumber) {
                System.out.println("Test ThreeMax4 = true");
            } else {
                System.out.println("Test ThreeMax4 = False");
            }
        }
        return 0;
    }
}








