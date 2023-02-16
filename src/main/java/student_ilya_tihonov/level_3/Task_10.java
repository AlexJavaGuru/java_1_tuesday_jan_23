package student_ilya_tihonov.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] agrs){

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Write the radius");
        double radius = Scanner.nextDouble();
        double pi = 3.14;
        double perimeter = 2 * pi * radius;
        double radius2 = radius * radius;
        double square = pi * radius2;
        System.out.println("Perimeter is =" +perimeter);
        System.out.println("Area is " +square);




    }

}
