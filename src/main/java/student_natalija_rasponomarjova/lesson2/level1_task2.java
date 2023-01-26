package student_natalija_rasponomarjova.lesson2;
/*
Написать консольную программу, которая запрашивает у пользователя два
 вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания,
 умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Написать консольную программу, которая запрашивает у пользователя два
 вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания,
 умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();*/

import java.util.Scanner;

public class level1_task2 {
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
