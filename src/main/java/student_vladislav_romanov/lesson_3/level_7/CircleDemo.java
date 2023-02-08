package student_vladislav_romanov.lesson_3.level_7;

import java.util.Scanner;

class CircleDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input radius: ");

        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Circle area is " + circle.calculateArea(circle.getRadius()));
    }

}
