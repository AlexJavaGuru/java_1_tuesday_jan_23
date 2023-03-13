package student_oksana_maksimova.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numberA = scanner.nextInt();

        System.out.println("Enter second number: ");
        int numberB = scanner.nextInt();

        System.out.println("Enter third number: ");
        int numberC = scanner.nextInt();

        if (numberA == numberB && numberB == numberC && numberC == numberA) {
            System.out.println("All numbers are equal");
        }
        else if (numberA != numberB && numberB != numberC && numberC != numberA) {
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}
