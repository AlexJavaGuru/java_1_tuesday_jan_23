package student_daniels_belejuns.lesson_4.level_3;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        double x = scan.nextInt();
        System.out.println("Second number: ");
        double y = scan.nextInt();
        System.out.println("Third number: ");
        double z = scan.nextInt();

        if (x < y && y > z) {
            System.out.println("increasing");
        } else if (x > y && y > z) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }


    }
}
