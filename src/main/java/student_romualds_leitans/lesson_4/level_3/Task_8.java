package student_romualds_leitans.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int a = scanner.nextInt();
        System.out.print("Insert second number: ");
        int b = scanner.nextInt();
        System.out.print("Insert third number: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

