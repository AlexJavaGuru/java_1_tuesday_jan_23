package student_daniels_belejuns.lesson_4.level_2;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("два целых числа: ");

        int first = scan.nextInt();
        int second = scan.nextInt();

        if (first >= second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }


    }
}
