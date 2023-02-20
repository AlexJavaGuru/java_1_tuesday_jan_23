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
    public boolean firstNumberIsBigger(int firstNumber, int secondNumber) {
        return (firstNumber > secondNumber);
    }
    public boolean secondNumberIsBigger(int firstNumber, int secondNumber) {
        return (secondNumber > firstNumber);
    }
    public boolean bothNumbersAreEqual(int firstNumber, int secondNumber) {
        return (secondNumber == firstNumber);
    }
    public boolean firstNumberIsBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber > secondNumber) & (firstNumber > thirdNumber);
    }
    public boolean secondNumberIsBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber < secondNumber) & (secondNumber > thirdNumber);
    }
    public boolean thirdNumberIsBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber < thirdNumber) & (secondNumber < thirdNumber);
    }
    public boolean  firstAndSecondNumbersAreBigger(int firstNumber, int secondNumber, int thirdNumber){
        return (firstNumber==secondNumber)& (firstNumber>thirdNumber);
    }
    public boolean  firstAndThirdNumbersAreBigger(int firstNumber, int secondNumber, int thirdNumber){
        return (firstNumber==thirdNumber)&(firstNumber>secondNumber);
    }
    public boolean  secondAndThirdNumbersAreBigger(int firstNumber, int secondNumber, int thirdNumber){
        return (secondNumber==thirdNumber)&(firstNumber<secondNumber);
    }
    public boolean  allThreeNumbersAreEqual(int firstNumber, int secondNumber, int thirdNumber){
        return (firstNumber==thirdNumber)&(firstNumber==secondNumber);
    }
}

