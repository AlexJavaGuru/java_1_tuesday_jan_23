package student_konstantin_kudrjavtsev.lesson_4.level_4_junior;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int min(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)
            return firstNumber;
        else if (secondNumber > firstNumber) {
            return secondNumber;
        }
        return firstNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
            return firstNumber;
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
                return secondNumber;
            } else {
                return thirdNumber;
            }
        }
    }
