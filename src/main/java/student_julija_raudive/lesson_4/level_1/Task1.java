package student_julija_raudive.lesson_4.level_1;

import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        }


    }
}
