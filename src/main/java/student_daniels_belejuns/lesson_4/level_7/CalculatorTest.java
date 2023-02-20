package student_daniels_belejuns.lesson_4.level_7;

class CalculatorTest {
    public static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 20;
        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println(firstNumber + secondNumber);
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;
        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println(firstNumber - secondNumber);
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        int result = calculator.mul(firstNumber, secondNumber);
        System.out.println(firstNumber * secondNumber);
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int expectedResult = 5;
        int result = calculator.div(firstNumber, secondNumber);
        System.out.println(firstNumber / secondNumber);
    }

    public void isEvenTest1() {
        boolean result = calculator.isEven(40);
        System.out.println("Even" + result);
    }

    public void isEvenTest2() {
        boolean result = calculator.isEven(41);
        System.out.println("Odd" + result);
    }
}
