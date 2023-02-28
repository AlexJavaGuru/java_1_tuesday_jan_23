package student_oksana_maksimova.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numberA = scanner.nextInt();

        System.out.println("Enter second number: ");
        int numberB = scanner.nextInt();

        System.out.println("Enter third number: ");
        int numberC = scanner.nextInt();

        if (numberA < numberB && numberB < numberC) {
            System.out.println("The largest number is " + numberC);
        }
        else if (numberA <= numberB && numberB >= numberC) {
            System.out.println("The largest number is " + numberB);
        }
        else if (numberA >= numberB && numberB <= numberC  && numberA < numberC) {
            System.out.println("The largest number is " + numberC);
        }
        else if (numberA >= numberB && numberB <= numberC && numberA >= numberC) {
                System.out.println("The largest number is " + numberA);
        }
        else if (numberA > numberB && numberB >= numberC && numberA >= numberC) {
            System.out.println("The largest number is " + numberA);
        }
    }
}
