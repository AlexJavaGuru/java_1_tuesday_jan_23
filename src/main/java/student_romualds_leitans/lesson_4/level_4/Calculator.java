package student_romualds_leitans.lesson_4.level_4;

class Calculator {
    public int threeNumbers (int Number1, int Number2, int Number3) {return Math.max( Math.max(Number1, Number2),Number3); }
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



