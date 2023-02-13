package student_andrejs_cekalins.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double firstNumber = number_input.nextInt();
        System.out.print("Please enter second number: ");
        double secondNumber = number_input.nextInt();
        System.out.print("Please enter third number: ");
        double thirdNumber = number_input.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.print("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.print("All numbers are different");
        } else {
            System.out.print("Neither all are equal or different");
        }
    }
}
