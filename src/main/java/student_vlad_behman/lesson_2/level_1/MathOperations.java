/*
Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.

1. Создать класс с нужным именем;
2. Создать описать main метод;
3. Воспользуйтесь специальным классом Scanner и его методом nextInt()
 для получения ввода с клавиатуры
          Scanner scanner = new Scanner(System.in);
          int firstNumber = scanner.nextInt();
4. Запишите полученные результаты в переменные;
5. При помощи System.out.println() выведите на консоль полученные результаты
 сложения, вычитания, умножения и деления.
 (каждый результат на новой строке отдельно).
 */

package student_vlad_behman.lesson_2.level_1;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose first number:  ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please choose second number:  ");
        int secondNumber = scanner.nextInt();

        int additionResult = firstNumber + secondNumber;
        int subtractionResult = firstNumber - secondNumber;
        int multiplicationResult = firstNumber * secondNumber;
        int divisionResult = firstNumber + secondNumber;

        System.out.println("Addition result is:  " + additionResult);
        System.out.println("Substraction result is:  " + subtractionResult);
        System.out.println("Multiplication result is:  " + multiplicationResult);
        System.out.println("Division result is:  " + divisionResult);

    }
}
