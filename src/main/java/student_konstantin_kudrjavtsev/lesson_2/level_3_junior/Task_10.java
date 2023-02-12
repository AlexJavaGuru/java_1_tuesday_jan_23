package student_konstantin_kudrjavtsev.lesson_2.level_3_junior;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter circle radius");
        double radius = input.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);
        System.out.println("Perimetr is: " + perimeter);
        System.out.println("Area ia: " + area);
    }
}
