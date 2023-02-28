package student_oleg_gryazev.lesson_4.level_1_10;

import java.util.Scanner;

public class ArithmeticOperation {
    int firstNumber;
    int secondNumber;
    int thirdNumber;


    void readArithmeticOptions() {
        System.out.println("Enter digit 1, and then enter one number, to know if number negative, positive, even or odd.");
        System.out.println("Enter digit 2, and then enter two numbers, to know if the numbers bigger, smaller or equal each other.");
        System.out.println("Enter digit 3, and then enter three numbers, to know if 3 numbers are in increasing, decreasing, or nor incr. , decr.");
        System.out.println("Enter digit 4, and then enter three numbers, to know if 3 numbers are equal, different, neither equal or different.");
        System.out.println("Enter 5 to quit program.");
    }

    void typeInOneDigit() {
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
    }

    void typeInTwoDigits() {
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
    }

    void typeInThreeDigits() {
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        thirdNumber = scanner.nextInt();
    }

    void ifDigitEvenOrQdd() {
        if (firstNumber % 2 == 0) {
            System.out.println("The digit is even");
        } else {
            System.out.println("The digit is odd");
        }
    }

    void negativePositiveOrZero() {
        if (firstNumber < 0) {

            System.out.println("The digit is negative and = " + firstNumber);
        } else if (firstNumber > 0) {
            System.out.println("The digit is positive and = " + firstNumber);
        } else System.out.println("The digit is = 0");

    }

    void ifBiggerSmallerEqual() {
        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger the second, " + firstNumber + " > " + secondNumber + ".");
        } else if (firstNumber < secondNumber) {
            System.out.println("First number is smaller the second, " + firstNumber + " < " + secondNumber + ".");
        } else {
            System.out.println("Both numbers are equal, " + firstNumber + " = " + secondNumber + ".");
        }

    }

    void ifEqualDifferentOrNotAll() {
        if (thirdNumber == secondNumber && firstNumber == secondNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != thirdNumber && thirdNumber != secondNumber && firstNumber != secondNumber) {
            System.out.println(" All numbers are not equal");
        } else
            System.out.println("All numbers are not equal or different");
    }

    void ifIncreasingDecreasingOrNotAll() {
        if (thirdNumber < secondNumber && firstNumber > secondNumber) {
            System.out.println("Numbers are in decreasing order");
        } else if (thirdNumber > secondNumber && firstNumber < secondNumber) {
            System.out.println("Numbers are in increasing order");
        } else
            System.out.println("All numbers are not increasing or decreasing");

    }
}






