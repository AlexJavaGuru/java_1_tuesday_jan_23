package student_dmitry_kupcus.lesson_4;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
    }
}
