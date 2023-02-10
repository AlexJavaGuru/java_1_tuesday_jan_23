package student_oksana_tarasova.lesson_4.level_2;

import java.util.Scanner;

class EqualsOrDifferent {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter two numbers...");
        int val1 = num.nextInt();
        int val2 = num.nextInt();

        if (val1 == val2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
