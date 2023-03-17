package student_oleg_gryazev.lesson_4.level_1_10;

import java.util.Scanner;

public class ArithmeticOperation {

    int typeInOneDigit() {
        Scanner scanner = new Scanner(System.in);
      return   scanner.nextInt();
           }

      void ifDigitEvenOrQdd() {
        ArithmeticOperation operation =new ArithmeticOperation();
        int firstNumber = operation.typeInOneDigit();
        if (firstNumber % 2 == 0) {
            System.out.println("The digit is even");
        } else {
            System.out.println("The digit is odd");
        }

    }

    void negativePositiveOrZero() {
               int firstNumber = typeInOneDigit();
        if (firstNumber < 0) {

            System.out.println("The digit is negative and = " + firstNumber);
        } else if (firstNumber > 0) {
            System.out.println("The digit is positive and = " + firstNumber);
        } else System.out.println("The digit is = 0");

    }

    void ifBiggerSmallerEqual() {
        int firstNumber = typeInOneDigit();
        int secondNumber = typeInOneDigit();
        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger the second, " + firstNumber + " > " + secondNumber + ".");
        } else if (firstNumber < secondNumber) {
            System.out.println("First number is smaller the second, " + firstNumber + " < " + secondNumber + ".");
        } else {
            System.out.println("Both numbers are equal, " + firstNumber + " = " + secondNumber + ".");
        }

    }

    void ifEqualDifferentOrNotAll() {
        int firstNumber = typeInOneDigit();
        int secondNumber = typeInOneDigit();
        int thirdNumber = typeInOneDigit();
        if (thirdNumber == secondNumber && firstNumber == secondNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != thirdNumber && thirdNumber != secondNumber && firstNumber != secondNumber) {
            System.out.println(" All numbers are not equal");
        } else
            System.out.println("All numbers are not equal or different");

    }
    void ifIncreasingDecreasingOrNotAll () {
        int firstNumber = typeInOneDigit();
        int secondNumber = typeInOneDigit();
        int thirdNumber = typeInOneDigit();
        if (thirdNumber < secondNumber && firstNumber > secondNumber) {
            System.out.println("Numbers are in decreasing order");
        } else if (thirdNumber > secondNumber && firstNumber < secondNumber) {
            System.out.println("Numbers are in increasing order");
        } else
            System.out.println("All numbers are not increasing or decreasing");

    }
}






