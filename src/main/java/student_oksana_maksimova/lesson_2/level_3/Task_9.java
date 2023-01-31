package student_oksana_maksimova.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10:");

        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++){

            System.out.println(number + "*" + i + " =" + (number * i));
        }
    }
}
