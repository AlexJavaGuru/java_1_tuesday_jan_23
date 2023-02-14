package student_oksana_tarasova.lesson_4.level_2;

import java.util.Scanner;

class EqualsOrDifferent {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter two numbers...");
        EqualsOrDifferent.equals(num.nextInt(), num.nextInt());
    }

    static void equals(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}

