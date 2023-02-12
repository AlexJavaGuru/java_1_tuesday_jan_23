package student_daniels_belejuns.lesson_3.level_7;

import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = scan.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Length: " + circle.getLength());

    }
}

