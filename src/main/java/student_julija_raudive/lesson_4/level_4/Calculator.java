package student_julija_raudive.lesson_4.level_4;

 class Calculator {




     public int sum(int firstNumber, int secondNumber) {
         return firstNumber + secondNumber;
     }

     public int subtraction(int firstNumber, int secondNumber) {
         return firstNumber - secondNumber;
     }

     public int multiplication(int firstNumber, int secondNumber) {
         return firstNumber * secondNumber;
     }

     public double division(int firstNumber, int secondNumber) {
         double result = (double)firstNumber / secondNumber;
         return result;
     }


     public boolean isEven(int number) {

         return number % 2 == 0;
     }

     public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
         if (firstNumber > secondNumber){
             return firstNumber;
         }
         else if(firstNumber < secondNumber){
             return secondNumber;
         }
         else{
             return firstNumber;
         }
     }

     public int maxOfThreeNumbers(int firstNumber, int secondNumber,int thirdNumber){
         if  (firstNumber >= secondNumber && firstNumber >= thirdNumber){
             return firstNumber;
         }
         else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
             return secondNumber;
         }
         else {
             return thirdNumber;
         }
     }




}
