package student_oksana_maksimova.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius:");

        double radius = scanner.nextDouble();

        double per = Math.PI*2*radius;
        System.out.println("Perimetr is: " + per);

        double ar = Math.PI*(radius * radius);
        System.out.println("Area is: " + ar);
    }
}
