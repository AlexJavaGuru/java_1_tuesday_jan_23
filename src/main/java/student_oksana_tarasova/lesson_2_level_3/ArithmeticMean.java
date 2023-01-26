package student_oksana_tarasova.lesson_2_level_3;

import java.util.Scanner;

public class ArithmeticMean {

    public static void main(String[] args) {

        System.out.println("Введите три любых числа");

        Scanner scanner = new Scanner (System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double count = (a+b+c)/3;

        System.out.println(count);
    }
}
