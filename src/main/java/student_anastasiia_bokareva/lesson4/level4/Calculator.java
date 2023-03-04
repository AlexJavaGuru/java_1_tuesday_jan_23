package student_anastasiia_bokareva.lesson4.level4;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        return (number % 2) == 0;
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
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
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int result;

        if (firstNumber > secondNumber) {
            result = firstNumber;
        } else {
            result = secondNumber;
        }
        return result;
    }
}

