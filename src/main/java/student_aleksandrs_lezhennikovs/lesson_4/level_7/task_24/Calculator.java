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

    public double div(int firstNumber, int secondNumber) {
        return firstNumber / (double)secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


class CalculatorTest {
    public static void main(String[] args) {

        sumTest();
        subTest();
        mulTest();
        divTest();
        isEvenTest1();
        isEvenTest2();
    }

    private static String checks(int result, int expectedResult) {

        if (result == expectedResult) {
            return " test = OK";
        } else {
            return " test = FAIL";
        }
    }

    private static String checks(boolean result) {

        if (result) {
            return " test = OK";
        } else {
            return " test = FAIL";
        }
    }

    private static String checks(double result, double expectedResult) {

        if (result == expectedResult) {
            return " test = OK";
        } else {
            return " test = FAIL";
        }
    }

    private static void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 75;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println("Addition" + checks(result, expectedResult));
    }

    private static void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        System.out.println("Subtract" + checks(result, expectedResult));
    }

    private static void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        System.out.println("Multiplying" + checks(result, expectedResult));
    }

    private static void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        double expectedResult = 5.0;
        Calculator calculator = new Calculator();
        double result = calculator.div(firstNumber, secondNumber);
        System.out.println("Dividing" + checks(result, expectedResult));
    }

    private static void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        System.out.println("Even" + checks(result));
    }

    private static void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        System.out.println("Odd" + checks(!result));
    }
}
