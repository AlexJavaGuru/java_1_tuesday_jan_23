/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.
 */


package student_vlad_behman.lesson_2.level_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose first number : ");
        int first = scanner.nextInt();

        System.out.println("Choose second number : ");
        int second = scanner.nextInt();

        System.out.println("Choose third number : ");
        int third = scanner.nextInt();

        System.out.println(((double) first + second + third)/3);

    }
}
