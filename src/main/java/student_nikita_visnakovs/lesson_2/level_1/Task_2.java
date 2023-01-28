package student_nikita_visnakovs.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("Enter 2 numbers");

        Scanner scanner = new Scanner(System.in);
        double userNum = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        double userNum1 = scanner.nextDouble();

        System.out.println(userNum + userNum1);
        System.out.println(userNum - userNum1);
        System.out.println(userNum * userNum1);
        System.out.println(userNum / userNum1);
    }
}
