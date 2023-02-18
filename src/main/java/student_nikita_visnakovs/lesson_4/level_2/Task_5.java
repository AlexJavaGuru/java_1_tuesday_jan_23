package student_nikita_visnakovs.lesson_4.level_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        System.out.println("Enter two integers");
        Scanner scanner = new Scanner(System.in);
        int firstUserNumber = scanner.nextInt();
        int secondUserNumber = scanner.nextInt();

        if (firstUserNumber > secondUserNumber) {
            System.out.println(firstUserNumber);
        } else {
            System.out.println(secondUserNumber);
        }
    }
}
