package student_andrejs_cekalins.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        double result1 = firstDoubleNumber + secondDoubleNumber;
        double result2 = firstDoubleNumber - secondDoubleNumber;
        double result3 = firstDoubleNumber * secondDoubleNumber;
        double result4 = firstDoubleNumber / secondDoubleNumber;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

