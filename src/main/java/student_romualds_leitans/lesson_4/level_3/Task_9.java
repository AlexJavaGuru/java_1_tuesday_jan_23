package student_romualds_leitans.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Insert second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Insert third number: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.print(" Increasing ");
        }else if (num1 > num2 && num2 > num3){
            System.out.print(" Decreasing ");
        }else {
            System.out.print(" Neither increasing or decreasing order ");
        }
    }
}
