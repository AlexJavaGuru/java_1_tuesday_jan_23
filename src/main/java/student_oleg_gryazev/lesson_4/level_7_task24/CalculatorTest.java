package student_oleg_gryazev.lesson_4.level_7_task24;


public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();

        test.sumTest();
        test.subTest();
        test.subTest();
        test.mulTest();
        test.divTest();
        test.evenTest();
        test.oddTest();

    }

    int result;
    boolean bulResult = true;
    Calculator calculator = new Calculator();

    void sumTest() {

        result = calculator.sum(35, 40);
        if (result == 75) {
            System.out.println("Sum test = " + result + " - OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void subTest() {
        result = calculator.sub(35, 15);

        if (result == 20) {
            System.out.println("Sub test = " + result + " - OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    void mulTest() {

        result = calculator.mul(5, 5);

        if (result == 25) {
            System.out.println("Mul test =  " + result + " - OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    void divTest() {
        result = calculator.div(40, 8);
        if (result == 5) {
            System.out.println("Div test = " + result +
                    " - OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    void evenTest() {
        bulResult = calculator.isEven(40);
        if (bulResult == calculator.isEven(0)) {
            System.out.println("isEven test = " + true + " and even - OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    void oddTest() {
        bulResult = calculator.isOdd(41);
        if (bulResult == calculator.isOdd(1)) {
            System.out.println("isOdd test = " + true + " and odd - OK");
        } else {
            System.out.println("isOdd test = FAIL");
        }
    }
}
