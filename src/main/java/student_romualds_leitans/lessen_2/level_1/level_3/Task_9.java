package student_romualds_leitans.lessen_2.level_1.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Test data: ");
        System.out.print("Imput a number: ");
        int value = input.nextInt();
        System.out.println("Expected Output: ");
        for (int i = 1; i <=10; i++) {
            System.out.println(value + " * " + i + " = " + (value * i));
        }
    }
}
