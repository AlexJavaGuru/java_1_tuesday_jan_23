package student_nikita_visnakovs.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("Enter three integers");
        Scanner scanner = new Scanner(System.in);
        int firstUserNum = scanner.nextInt();
        int secondUserNum = scanner.nextInt();
        int thirdUserNum = scanner.nextInt();

        if (firstUserNum == secondUserNum && secondUserNum == thirdUserNum) {
            System.out.println("All number are equal");
        } else if (firstUserNum != secondUserNum && secondUserNum != thirdUserNum) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
