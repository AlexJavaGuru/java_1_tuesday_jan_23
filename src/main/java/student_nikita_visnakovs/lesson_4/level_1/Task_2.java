package student_nikita_visnakovs.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("Enter integer...");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber > 0) {
            System.out.println("Your number is positive");
        } else if (userNumber < 0){
            System.out.println("your number is negative");
        } else {
            System.out.println("Your number = 0");
        }
    }
}
