package student_aleksandrs_lezhennikovs.lessons_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input Radius:");
        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Circumference is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
