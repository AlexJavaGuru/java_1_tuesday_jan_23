package student_natalija_rasponomarjova.lesson2;
/* Написать консольную программу, которая запрашивает у пользователя два целых числа и
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
 (каждый результат на новой строке отдельно).*/

import java.util.Scanner;

public class level1_task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }

}
