package student_ilya_tihonov.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        int day = Scanner.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {System.out.println("Error");}
    }
}