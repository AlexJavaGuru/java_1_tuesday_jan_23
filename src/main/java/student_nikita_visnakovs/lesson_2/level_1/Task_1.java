package student_nikita_visnakovs.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        System.out.println("Enter 2 integers");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int userNum1 = scanner1.nextInt();
        System.out.println(userNum + userNum1);
        System.out.println(userNum - userNum1);
        System.out.println(userNum * userNum1);
        System.out.println(userNum / userNum1);
    }
}
