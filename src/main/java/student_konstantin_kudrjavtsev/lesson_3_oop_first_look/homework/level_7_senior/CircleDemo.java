package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_7_senior;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Scanner input = new Scanner(System.in);
        System.out.println("enter circle radius: ");
        double radius = input.nextInt();
        circle.setRadius(radius);


        double area = circle.calculateArea(circle.getRadius());
        System.out.println("Circle area: " + area);
    }
}