package student_nikita_visnakovs.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        System.out.println("Enter integer");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        if (userNum % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is not even");
        }

    }
}
