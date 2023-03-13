package student_ilya_tihonov.lesson_4.level_1.task_4;

import student_ilya_tihonov.lesson_4.level_1.task_4.CheckNumber;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args){

        CheckNumber value = new CheckNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (value.isOdd(number)) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is not even");
        }

    }

}
