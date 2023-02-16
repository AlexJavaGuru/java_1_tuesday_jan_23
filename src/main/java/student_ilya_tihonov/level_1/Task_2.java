package student_ilya_tihonov.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] agrs){

        System.out.println("Please write two numbers");

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);

    }
}
