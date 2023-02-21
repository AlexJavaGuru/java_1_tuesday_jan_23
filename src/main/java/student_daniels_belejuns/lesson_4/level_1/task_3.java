package student_daniels_belejuns.lesson_4.level_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String days = scan.nextLine();
        int n = Integer.parseInt(days);
        if (n == 1) {
            System.out.println("понедельник");
        } else if (n == 2) {
            System.out.println("вторник");
        } else if (n == 3) {
            System.out.println("среда");
        } else if (n == 4) {
            System.out.println("четверг");
        } else if (n == 5) {
            System.out.println("пятница");
        } else if (n == 6) {
            System.out.println("суббота");
        } else if (n == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("нету такого дня");
        }
    }
}

