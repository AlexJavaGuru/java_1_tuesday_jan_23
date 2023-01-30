package student_oksana_tarasova.lesson_2.level_3;


import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {

    System.out.println("Введите любое целое число");
    Scanner scanner = new Scanner (System.in);
    int number = scanner.nextInt();
    int factor = 1;
        while (factor<11) {
            System.out.println(number + " * " + factor + " = " + number*factor);
            factor = factor + 1;

        }

    }
}
