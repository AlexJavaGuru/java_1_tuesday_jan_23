package student_natalija_rasponomarjova.lesson_3.level_2;
// Тема: Считывание строк с консоли.

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }

}
