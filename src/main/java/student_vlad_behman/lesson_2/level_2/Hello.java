/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

 */
package student_vlad_behman.lesson_2.level_2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scanner.nextLine();

        System.out.println("Hello "  + name);
        
    }
}
