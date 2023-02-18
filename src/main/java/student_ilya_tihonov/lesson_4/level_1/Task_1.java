package student_ilya_tihonov.lesson_4.level_1;

import student_ilya_tihonov.lesson_4.level_1.task_4.CheckNumber;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {


        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive number.");
        } else {
            System.out.println(number + " is negative number");
        }

    }
}
