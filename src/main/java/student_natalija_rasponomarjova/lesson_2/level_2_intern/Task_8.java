package student_natalija_rasponomarjova.lesson_2.level_2_intern;
/* Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя! */

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();

        System.out.println("Hello, " + user);
    }
}
