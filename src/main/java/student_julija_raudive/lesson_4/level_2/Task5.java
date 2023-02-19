package student_julija_raudive.lesson_4.level_2;

import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {

        System.out.println("Enter two numbers.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number one:");
        int varA = scanner.nextInt();

        System.out.println("Number two:");
        int varB = scanner.nextInt();

        if (varA >= varB) {

            System.out.println("The largest number is " + varA);

        } else {

            System.out.println("The largest number is " + varB);

        }

    }
}
