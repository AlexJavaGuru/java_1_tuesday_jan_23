package student_oksana_tarasova.lesson_4.level_1;

import java.util.Scanner;

class Number {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter number...");
        Number.posit(num.nextInt());
    }

    static void posit(int number) {
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        }
    }
}
