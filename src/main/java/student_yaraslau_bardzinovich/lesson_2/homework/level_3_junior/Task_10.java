package student_yaraslau_bardzinovich.lesson_2.homework.level_3_junior;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle Perimeter & Area Calculator ");
        System.out.print("Input Radius=");
        double radius = scanner.nextDouble();
        System.out.println("Output: ");
            System.out.println("Perimeter:" + 2 * Math.PI * radius);
        System.out.println("Area:" + Math.PI * Math.pow(radius, 2));
    }
}
