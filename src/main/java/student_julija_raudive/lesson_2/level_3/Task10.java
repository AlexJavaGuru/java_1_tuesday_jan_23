package student_julija_raudive.lesson_2.level_3;


import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        System.out.println("Radius:");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);





    }



}
