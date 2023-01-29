package student_julija_raudive.lesson_2.level_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        double sum =firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sum);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + subtraction);
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + multiplication);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + division);
    }
}
