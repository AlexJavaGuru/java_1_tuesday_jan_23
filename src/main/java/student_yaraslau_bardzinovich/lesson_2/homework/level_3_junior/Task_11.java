package student_yaraslau_bardzinovich.lesson_2.homework.level_3_junior;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Average Calcurator: ");
        System.out.print("Input 1st number= ");
        double first = scanner.nextDouble();
        System.out.print("Input 2nd number= ");
        double second = scanner.nextDouble();
        System.out.print("Input 3rd number= ");
        double third = scanner.nextDouble();

        System.out.println("Average= " + (first + second + third) / 3);
    }
}
