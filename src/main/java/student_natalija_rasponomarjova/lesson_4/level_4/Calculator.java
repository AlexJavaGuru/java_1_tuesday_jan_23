package student_natalija_rasponomarjova.lesson_4.level_4;

class Calculator {
    public int sum(int number1, int number2) {

        return number1 + number2;
    }

    public int subtraction(int number1, int number2) {

        return number1 - number2;
    }

    public int multiplication(int number1, int number2) {

        return number1 * number2;
    }

    public int division(int number1, int number2) {

        return number1 / number2;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public int maxOfThreeNumbers(int number1, int number2, int number3) {

        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }
}

