package student_romualds_leitans.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Insert second number: ");
        int num2 = scanner.nextInt();

        if (num1 == num2){
            System.out.println( num1 + " and " + num2 + " Numbers are equals");
        }else if (num1 != num2){
            System.out.println(num1 + " and " + num2 + " Numbers are different");
        }
    }
}
