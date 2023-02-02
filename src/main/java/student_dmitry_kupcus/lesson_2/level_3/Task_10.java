package student_dmitry_kupcus.lesson_2.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        System.out.println("Perimeter: " + 2 * 3.14 * radius);
        System.out.println("Area: " + (radius * radius) * 3.14);


    }
}

