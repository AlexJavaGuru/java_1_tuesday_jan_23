package student_oksana_maksimova.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.isOddTest();
        calculatorTest.firstMaxOfTwoNumbersTest();
        calculatorTest.secMaxOfTwoNumbersTest();
        calculatorTest.equalMaxOfTwoNumbersTest();
        calculatorTest.firMaxOfThreeNumbersTest();
        calculatorTest.secMaxOfThreeNumbersTest();
        calculatorTest.thrMaxOfThreeNumbersTest();
        calculatorTest.firAndSecMaxOfThreeNumbersTest();
        calculatorTest.secAndThirdMaxOfThreeNumbersTest();
        calculatorTest.allThreeEqualTest();
    }
    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 4;
        Calculator calculator = new Calculator();
        boolean isEvenResult = calculator.isEven(number);
        if (isEvenResult == true) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }    public void isOddTest() {
        int number = 3;
        Calculator calculator = new Calculator();
        boolean isEvenResult = calculator.isEven(number);
        if (isEvenResult == false) {
            System.out.println("isOdd test = OK");
        } else {
            System.out.println("isOdd test = FAIL");
        }
    }
    public void firstMaxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two test - first nr = OK");
        }
        else {
            System.out.println("Max of two test - first nr = FAIL");
        }
    }
    public void secMaxOfTwoNumbersTest() {
        int firstNumber = 1;
        int secondNumber = 5;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two test - second nr = OK");
        }
        else {
            System.out.println("Max of two test - second nr = FAIL");
        }
    }
    public void equalMaxOfTwoNumbersTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two equal test - equal = OK");
        }
        else {
            System.out.println("Max of two equal test - equal = FAIL");
        }
    }
    public void firMaxOfThreeNumbersTest(){
        int firstNumber = 7;
        int secondNumber = 3;
        int thirdNumber = 5;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three test - first = OK");
        }
        else {
            System.out.println("Max of three test - first = FAIL");
        }
    }
    public void secMaxOfThreeNumbersTest(){
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 1;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three test - second = OK");
        }
        else {
            System.out.println("Max of three test - second = FAIL");
        }
    }
    public void thrMaxOfThreeNumbersTest(){
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 6;
        int expectedResult = thirdNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three test - third = OK");
        }
        else {
            System.out.println("Max of three test - third = FAIL");
        }
    }
    public void firAndSecMaxOfThreeNumbersTest(){
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 1;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult ==  realResult) {
            System.out.println("Max of three test - first = second > third = OK");
        }
        else {
            System.out.println("Max of three test - first = second > third = FAIL");
        }
    }
    public void secAndThirdMaxOfThreeNumbersTest(){
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbersIsEqual(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three test - second = third > first = OK");
        }
        else {
            System.out.println("Max of three test - second = third > first = FAIL");
        }
    }
    public void allThreeEqualTest(){
            int firstNumber = 4;
            int secondNumber = 4;
            int thirdNumber = 4;
            int expectedResult = 4;
            Calculator calculator = new Calculator();
            int realResult = calculator.threeNumbersIsEqual(firstNumber, secondNumber, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("All three numbers are equal test = OK");
            }
            else {
                System.out.println("All three numbers are equal test = FAIL");
            }
        }
    }



