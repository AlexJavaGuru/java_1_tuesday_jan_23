package student_natalija_rasponomarjova.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.evenNumberTest();
    }

    public void sumTest() {
        int number1 = 20;
        int number2 = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(number1, number2);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractionTest() {
        int number1 = 20;
        int number2 = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(number1, number2);
        if(realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        }
        else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int number1 = 3;
        int number2 = 10;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(number1, number2);
        if(realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        }
        else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int number1 = 30;
        int number2 = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(number1, number2);
        if(realResult == expectedResult) {
            System.out.println("Division test = OK");
        }
        else {
            System.out.println("Division test = FAIL");
        }
    }

    public void evenNumberTest() {
        int number = 90;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if(realResult == expectedResult) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }

    }

}
