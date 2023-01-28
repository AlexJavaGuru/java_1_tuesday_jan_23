/*
Написать консольную программу, которая запрашивает у пользователя два
 вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания,
 умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();
 */


package student_vlad_behman.lesson_2.level_1;

import java.util.Scanner;

public class MathOperationsDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose first number:  ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Please choose second number:  ");
        double secondNumber = scanner.nextDouble();

        double additionResult = firstNumber + secondNumber;
        double subtractionResult = firstNumber - secondNumber;
        double multiplicationResult = firstNumber * secondNumber;
        double divisionResult = firstNumber + secondNumber;

        System.out.println("Addition result is:  " + additionResult);
        System.out.println("Substraction result is:  " + subtractionResult);
        System.out.println("Multiplication result is:  " + multiplicationResult);
        System.out.println("Division result is:  " + divisionResult);
    }
}
