package student_oksana_tarasova.lesson_4.level_1;

import java.util.Scanner;

class NumberInt {

    public static void main(String[] args) {

        Scanner num = new Scanner (System.in);
        System.out.println("Input number...");
        int number = num.nextInt();

        if (number > 0) {
            System.out.println( number + " is positive ");
        } else if (number < 0) {
            System.out.println(number + " is negative");
            } else {
            System.out.println("Number is zero");
        }
    }
}
