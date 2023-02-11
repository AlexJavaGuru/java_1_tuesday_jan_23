package student_nikita_visnakovs.lesson_4.level_4;

public class Calculator {


    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


    public int min(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }


    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if ((firstNumber == secondNumber & firstNumber > thirdNumber) || (firstNumber == thirdNumber & firstNumber > secondNumber)) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}

