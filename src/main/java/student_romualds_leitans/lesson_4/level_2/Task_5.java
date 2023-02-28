package student_romualds_leitans.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2 ){
            System.out.print("First number is greater than the second");
        }else {
            System.out.println("Second number is greater than the first");
        }
    }
}
