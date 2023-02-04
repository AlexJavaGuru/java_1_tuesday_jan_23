package student_julija_raudive.lesson_2.level_3;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        System.out.println("Please enter the number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int i=1; i<=10; i++){

            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }


    }
}
