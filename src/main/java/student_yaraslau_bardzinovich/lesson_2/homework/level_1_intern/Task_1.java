package student_yaraslau_bardzinovich.lesson_2.homework.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        int Multiply = firstNumber * secondNumber;
        int Divide = firstNumber / secondNumber;
        int Plus = firstNumber + secondNumber;
        int Minus = firstNumber - secondNumber;

        System.out.println("Multiply:" + Multiply);
        System.out.println("Divide:" + Divide);
        System.out.println("Plus:" + Plus);
        System.out.println("Minus:" + Minus);
    }

}
