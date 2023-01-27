package student_nikita_visnakovs.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        double userNum = scanner.nextDouble();
        double Pi = Math.PI;


        System.out.println( Pi * (userNum * userNum));
        System.out.println(2 * Pi * userNum);
    }
}
