package student_ilya_tihonov.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int result;
        if (firstNumber >= secondNumber) {
            result = firstNumber;
        } else {
            result =  secondNumber;
        }
        return result;
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result;
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            result = firstNumber;
        } else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
            result =  secondNumber;
        } else {result = thirdNumber;}
        return result;
    }


}



