package student_daniels_belejuns.lesson_2.level_1;

import java.util.Scanner;

public class lvl1task2 {
    public static void main (String... args) {
        Scanner scanner = new Scanner(System.in);


        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        double result = firstDoubleNumber + secondDoubleNumber;
        System.out.println(firstDoubleNumber+secondDoubleNumber);
        System.out.println(firstDoubleNumber-secondDoubleNumber);
        System.out.println(firstDoubleNumber/secondDoubleNumber);
        System.out.println(firstDoubleNumber*secondDoubleNumber);


    }
}
