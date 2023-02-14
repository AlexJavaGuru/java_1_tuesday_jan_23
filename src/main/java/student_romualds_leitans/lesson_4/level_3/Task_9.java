package student_romualds_leitans.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int a = scanner.nextInt();
        System.out.print("Insert second number: ");
        int b = scanner.nextInt();
        System.out.print("Insert third number: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.print(" Increasing ");
        }else if (a > b && b > c){
            System.out.print(" Decreasing ");
        }else {
            System.out.print(" Neither increasing or decreasing order ");
        }
    }
}
