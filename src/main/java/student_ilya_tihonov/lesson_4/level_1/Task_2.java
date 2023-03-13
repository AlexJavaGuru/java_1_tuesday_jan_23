package student_ilya_tihonov.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args){


        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive number.");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " = 0");
        }



    }

}
