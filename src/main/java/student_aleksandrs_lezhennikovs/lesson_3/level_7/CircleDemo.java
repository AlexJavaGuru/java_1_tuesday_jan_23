package student_aleksandrs_lezhennikovs.lesson_3.level_7;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {

        Circle firstCircle = new Circle();

        Scanner input = new Scanner(System.in);

        System.out.println("Please input radius; ");
        double radius = input.nextDouble();
        firstCircle.setRadius(radius);

        double area = firstCircle.calculateArea(firstCircle.getRadius());
        System.out.println("Circle area is " + area);

    }

}
