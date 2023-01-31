package student_oksana_maksimova.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first double number");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter the second double number");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println(firstDoubleNumber + "+" + secondDoubleNumber+"="+(firstDoubleNumber + secondDoubleNumber));
        System.out.println(firstDoubleNumber + "-" + secondDoubleNumber+"="+(firstDoubleNumber - secondDoubleNumber));
        System.out.println(firstDoubleNumber + "/" + secondDoubleNumber+"="+(firstDoubleNumber / secondDoubleNumber));
        System.out.println(firstDoubleNumber + "*" + secondDoubleNumber+"="+(firstDoubleNumber * secondDoubleNumber));
    }
}
