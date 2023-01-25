package student_vladislav_romanov.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius:");

        double radius = scanner.nextDouble();

        System.out.println("Perimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * Math.pow(radius, 2)));
    }

}
