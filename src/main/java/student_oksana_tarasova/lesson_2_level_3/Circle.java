package student_oksana_tarasova.lesson_2_level_3;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

    System.out.println("Введите радиус круга");

    Scanner scanner = new Scanner(System.in);
    double radius = scanner.nextDouble();
    double pi = 3.14;
    double perimetr = 2*pi*radius;
    double area = pi*(radius*radius);

     System.out.println("Perimetr is = " + perimetr);
     System.out.println("Area is = " + area);


    }
}
