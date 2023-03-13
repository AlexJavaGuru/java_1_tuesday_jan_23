package student_oksana_maksimova.lesson_4.level_4;

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
    public double div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber <= secondNumber && secondNumber <= thirdNumber) {
            return thirdNumber;
        }
        else if (firstNumber <= secondNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        }
        else if (firstNumber >= secondNumber && firstNumber <= thirdNumber) {
            return thirdNumber;
        }else if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        }
        return 0;
    }
    public int threeNumbersIsEqual (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber == secondNumber && secondNumber >= thirdNumber){
            return firstNumber;
        }else if (secondNumber == thirdNumber && secondNumber >firstNumber){
            return secondNumber;
        }else if (firstNumber == secondNumber && secondNumber == thirdNumber){
            return thirdNumber;
        }
        return 0;
    }
}
