package student_oksana_maksimova.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double f = scanner.nextInt();

        System.out.println("Enter second number:");
        double s = scanner.nextInt();

        System.out.println("Enter third number:");
        double t = scanner.nextInt();

        System.out.println("Average: " + (f+s+t)/3);
    }
}
