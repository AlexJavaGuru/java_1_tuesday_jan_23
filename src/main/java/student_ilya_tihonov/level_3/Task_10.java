package student_ilya_tihonov.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] agrs){

        Scanner radius = new Scanner(System.in);
        System.out.println("Write the radius");
        double r = radius.nextDouble();
        double pi = 3.14;
        double c = 2 * pi * r;
        double r2 = r * r;
        double s = pi * r2;
        System.out.println("Perimeter is =" +c);
        System.out.println("Area is " +s);




    }

}
