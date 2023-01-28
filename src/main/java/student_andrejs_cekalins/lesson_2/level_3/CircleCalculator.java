package student_andrejs_cekalins.lesson_2.level_3;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner radius_input = new Scanner(System.in);

        System.out.println("Test Data: ");
        System.out.print("Radius: ");
        double radius = radius_input.nextDouble();
        System.out.println();
        System.out.println("Expected Output : ");

        double perimeter= 2*Math.PI * radius ;
        System.out.println("Perimeter is =" +perimeter);
        double area= Math.PI * radius * radius ;
        System.out.println("Area is = " +area);
    }
}
