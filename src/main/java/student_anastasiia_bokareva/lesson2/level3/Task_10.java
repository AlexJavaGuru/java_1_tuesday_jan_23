package student_anastasiia_bokareva.lesson2.level3;

import java.util.Scanner;
import java.lang.Math;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius - ");
        double radius = scan.nextDouble();
        double pi = Math.PI;
        double p = 2*pi*radius;
        System.out.println("Perimeter = " + p);
        double s = pi*(radius*radius);
        System.out.println("Area = " + s);





    }
}

