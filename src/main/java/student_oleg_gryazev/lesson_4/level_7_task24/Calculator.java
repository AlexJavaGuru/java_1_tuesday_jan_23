package student_oleg_gryazev.lesson_4.level_7_task24;

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
        int result;
        boolean bulResult;
        Calculator calculator = new Calculator();

        result = calculator.sum(35, 40);
        if (result == 75) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

        result = calculator.sub(35, 15);

        if (result == 20) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }


        result = calculator.mul(5, 5);

        if (result == 25) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }

        result = calculator.div(40, 8);
        if (result == 5) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }


        bulResult = calculator.isEven(40);
        if (bulResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }


        bulResult = calculator.isEven(41);
        if (!bulResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
}
