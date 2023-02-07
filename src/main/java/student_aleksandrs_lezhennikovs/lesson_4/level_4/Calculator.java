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
        // if(number % 2 == 0);
        int result = number % 2;
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

    int maxOfTwoNumbers (int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;

        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;

        } else {
            return thirdNumber;
        }

    }
}
