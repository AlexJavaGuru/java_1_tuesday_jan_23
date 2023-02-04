package student_natalija_rasponomarjova.lesson_2.level_1_intern;
/*
Написать консольную программу, которая запрашивает у пользователя два
 вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания,
 умножения и деления. */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);

    }


}
