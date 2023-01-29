package student_nikita_visnakovs.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        System.out.println("Enet 3 numbers...");

        Scanner scanner = new Scanner(System.in);
        int userNum =  scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int userNum1 = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int userNum2 = scanner.nextInt();

        System.out.println((userNum + userNum1 + userNum2) /(double) 3);
    }
}
