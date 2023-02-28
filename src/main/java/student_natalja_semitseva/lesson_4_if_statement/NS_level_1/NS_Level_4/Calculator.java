package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_4;

import java.util.Scanner;

class Calculator {

    public int sum(int firstNumberA, int secondNumberB) {

        return firstNumberA + secondNumberB;
    }

    public int mul(int firstNumberA, int secondNumberB) {
        return firstNumberA * secondNumberB;

    }

    public int subtract(int firstNumberA, int secondNumberB) {
        return firstNumberA - secondNumberB;


    }

    public double divide(int firstNumberA, int secondNumberB) {
        return firstNumberA / (double) secondNumberB;

    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
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
        } else  {
            return thirdNumber;
        }
    }
}

