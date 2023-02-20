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

    public int divide(int firstNumberA, int secondNumberB) {
        return firstNumberA / secondNumberB;

    }

    boolean isEven1(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;


    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }


    public static class MaxOfTwoNumbers {

        public MaxOfTwoNumbers() {
        }
    }

    public static int maxOfTwoNumbers(int firstNumber, int secondNumber) {


        if (firstNumber > secondNumber) {
        } else if (secondNumber > firstNumber) {
        } else {

        }
        return firstNumber;
    }

    public static int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {


        if (firstNumber > secondNumber && firstNumber > thirdNumber) {

            return firstNumber;

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {

        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {

        } else if ((thirdNumber = firstNumber) > secondNumber) {

        } else {

        }
        return firstNumber;
    }
}

