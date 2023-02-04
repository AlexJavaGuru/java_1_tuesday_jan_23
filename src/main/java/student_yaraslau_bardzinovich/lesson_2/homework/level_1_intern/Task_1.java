package student_yaraslau_bardzinovich.lesson_2.homework.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int Multiply = firstNumber * secondNumber;
        int Divide = firstNumber / secondNumber;
        int Plus = firstNumber + secondNumber;
        int Minus = firstNumber - secondNumber;

        System.out.println(Multiply);
        System.out.println(Divide);
        System.out.println(Plus);
        System.out.println(Minus);
    }

}
