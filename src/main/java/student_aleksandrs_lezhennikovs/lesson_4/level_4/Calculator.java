package student_aleksandrs_lezhennikovs.lesson_4.level_4;

class Calculator {

    int sumNumbers(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    int subtract(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    int multiply(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    double divide(int firstNumber, int secondNumber) {

        return firstNumber / (double)secondNumber;
    }

    boolean isEven(int number) {

        return (number % 2 == 0);
    }

    int maxOfTwoNumbers (int firstNumber, int secondNumber) {
        int result;

        if (firstNumber >= secondNumber) {
            result = firstNumber;
        } else {
            result = secondNumber;
        }
        return result;
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            result = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            result = secondNumber;
        } else {
            result = thirdNumber;
        }
        return result;
    }
}
