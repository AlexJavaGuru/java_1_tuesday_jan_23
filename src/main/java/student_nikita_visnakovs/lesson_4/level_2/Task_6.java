package student_nikita_visnakovs.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        System.out.println("Enter two integers..");
        Scanner scanner = new Scanner(System.in);
        int firstUserNum = scanner.nextInt();
        int secondUserNum = scanner.nextInt();

        if (firstUserNum < secondUserNum) {
            System.out.println(firstUserNum);
        } else {
            System.out.println(secondUserNum);
        }
    }
}
