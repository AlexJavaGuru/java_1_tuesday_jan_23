package student_romualds_leitans.lesson_4.level_4;

class Calculator {
    public int maxOFThreeNumbers (int number1, int number2, int number3) {return Math.max( Math.max(number1, number2),number3); }
    public boolean isEven (int number) {return (number % 2 == 0 ); }
    public int maxOfTwoNumber (int firstNumber, int secondNumber){return Math.max(firstNumber,secondNumber); }
    public int sum (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int sub (int firstNumber, int secondNumber) {
         return firstNumber - secondNumber;
    }
    public int mul (int firstNumber, int secondNumber) {
         return firstNumber * secondNumber;
    }
    public int div (int firstNumber, int secondNumber) { return firstNumber / secondNumber; }

 }



