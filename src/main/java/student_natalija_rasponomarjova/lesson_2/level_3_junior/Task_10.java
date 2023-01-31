package student_natalija_rasponomarjova.lesson_2.level_3_junior;

import java.util.Scanner;

/* Напишите программу, которая запрашивает у пользователя радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.
Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double circleRadius = scanner.nextDouble();
        double circlePerimeter = 2 * 3.14159265358979323 * circleRadius;
        double circleArea = 3.14159265358979323 * (circleRadius * circleRadius);

        System.out.println("Perimeter is = " + circlePerimeter);
        System.out.println("Area is = " + circleArea);

    }
}
