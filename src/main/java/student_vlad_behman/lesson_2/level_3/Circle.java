/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

package student_vlad_behman.lesson_2.level_3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:  ");
        double radius = scanner.nextDouble();

        double perimetr = radius * Math.PI * 2;
        double area = radius * radius * Math.PI;

        System.out.println("Perimeter is: " + perimetr);
        System.out.println("Area is: " + area);

    }
}
