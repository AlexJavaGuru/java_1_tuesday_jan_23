package student_vladislav_romanov.lesson_4.level_7;

class CalculatorTest {

    public static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        sumTest();
        subTest();
        mulTest();
        divTest();
        isEvenTest1();
        isEvenTest2();
    }

    public static void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        printResult(calculator.sum(firstNumber, secondNumber), 75, "Sum");
    }

    public static void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        printResult(calculator.sub(firstNumber, secondNumber), 20, "Sub");
    }

    public static void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        printResult(calculator.mul(firstNumber, secondNumber), 25, "Mul");
    }

    public static void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        printResult(calculator.div(firstNumber, secondNumber), 5, "Div");
    }

    public static void isEvenTest1() {
        printResult(calculator.isEven(40), true, "isEven");
    }

    public static void isEvenTest2() {
        printResult(calculator.isEven(41), false, "isEven");
    }

    public static void printResult(int result, int expected, String test) {
        if (result == expected) {
            System.out.println(test + " test = OK");
        } else {
            System.out.println(test + " test = FAIL");
        }
    }

    public static void printResult(boolean result, boolean expected, String test) {
        if (result == expected) {
            System.out.println(test + " test = OK");
        } else {
            System.out.println(test + " test = FAIL");
        }
    }
}
