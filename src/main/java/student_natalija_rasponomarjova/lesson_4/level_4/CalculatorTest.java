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
        calculatorTest.number1MaxTest();
        calculatorTest.number2MaxTest();
        calculatorTest.numberEqualityTest();
        calculatorTest.number1MaxFrom3Test();
        calculatorTest.number2MaxFrom3Test();
        calculatorTest.number3MaxFrom3Test();
        calculatorTest.number1and2EqualBiggerThan3Test();
        calculatorTest.allNumbersAreEqualTest();
        calculatorTest.number2and3EqualBiggerThan1Test();

    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = TEST OK");
        } else {
            System.out.println(testName + " = TEST FAILED");
        }
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int number1 = 20;
        int number2 = 5;
        int realResult = calculator.sum(number1, number2);

        checkResults(realResult == 25, "Sum");
    }

    public void subtractionTest() {
        int number1 = 20;
        int number2 = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(number1, number2);

        checkResults(realResult == 15, "Subtraction");
    }

    public void multiplicationTest() {
        int number1 = 3;
        int number2 = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(number1, number2);

        checkResults(realResult == 30, "Multiplication");
    }

    public void divisionTest() {
        int number1 = 30;
        int number2 = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(number1, number2);

        checkResults(realResult == 10, "Division");
    }

    public void evenNumberTest() {
        int number = 88;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        checkResults(realResult, "Number is Even");
    }

    public void oddNumberTest() {
        int number = 77;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        checkResults(!realResult, "Number is Odd");
    }

    public void number1MaxTest() {
        int number1 = 18;
        int number2 = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(number1, number2);

        checkResults(realResult == 18, "Number 1 is maximal");
    }

    public void number2MaxTest() {
        int number1 = 88;
        int number2 = 888;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(number1, number2);

        checkResults(realResult == 888, "Number 2 is maximal");
    }

    public void numberEqualityTest() {
        int number1 = 100;
        int number2 = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(number1, number2);

        checkResults(number1 == number2, "2 Numbers are equal");

    }

    public void number1MaxFrom3Test() {
        int number1 = 80;
        int number2 = 70;
        int number3 = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        checkResults(realResult == number1, "Number 1 is maximal");
    }

    public void number2MaxFrom3Test() {
        int number1 = 80;
        int number2 = 170;
        int number3 = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        checkResults(realResult == number2, "Number 2 is maximal");

    }

    public void number3MaxFrom3Test() {
        int number1 = 80;
        int number2 = 170;
        int number3 = 300;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        checkResults(realResult == number3, "Number 3 is maximal");
    }

    public void number1and2EqualBiggerThan3Test() {
        int number1 = 50;
        int number2 = 50;
        int number3 = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        checkResults(number1 == number2 && number1 > number3 && number2 > number3,
                "Number 1 and 2 are equal and bigger than number 3");
    }

    public void allNumbersAreEqualTest() {
        int number1 = 50;
        int number2 = 50;
        int number3 = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        checkResults(number1 == number2 && number2 == number3, "Numbers are equal");
    }

    public void number2and3EqualBiggerThan1Test() {
        int number1 = 30;
        int number2 = 90;
        int number3 = 90;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(number1, number2, number3);

        checkResults(number2 == number3 && realResult > number1,
                "Number 2 and 3 are equal and bigger than number 1");
    }
}




