package student_vladislav_romanov.lesson_2.level_senior;

import java.util.Scanner;

public class Super_task_5 {

    public static void main(String[] args) {
        /*
        * This is version of program from Task_10, but with additional comments
        */
        Scanner scanner = new Scanner(System.in); // Creating Scanner
        System.out.print("Input radius: "); // Show to user proposal to input radius

        double radius = scanner.nextDouble();

        // Result printing part
        System.out.println("Perimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * Math.pow(radius, 2)));
    }

}
