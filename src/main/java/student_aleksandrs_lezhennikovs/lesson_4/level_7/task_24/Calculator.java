package student_aleksandrs_lezhennikovs.lesson_4.level_7.task_24;

        //Подсказка: вынесите в отдельный метод проверку
        //результата и замените её вызовом метода в каждом тесте.

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    String checks(int result, int expectedResult) {

        if (result == expectedResult) {
            return " test = OK";
        } else {
            return " test = FAIL";
        }
    }

    String checks(boolean result, boolean expectedResult) {

        if (result == expectedResult) {
            return " test = OK";
        } else {
            return " test = FAIL";
        }
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 75;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println("Addition" + checks(result, expectedResult));
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        System.out.println("Subtract" + checks(result, expectedResult));
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        System.out.println("Multiplying" + checks(result, expectedResult));
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        System.out.println("Dividing" + checks(result, expectedResult));
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean result = calculator.isEven(40);
        System.out.println("Even" + checks(result, expectedResult));
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean expectedResult = false;
        boolean result = calculator.isEven(41);
        System.out.println("Odd" + checks(result, expectedResult));
    }
}
