package student_oksana_tarasova.lesson_4.level_2;

import java.util.Scanner;

class MoreNumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter two numbers...");
        MoreNumber.numberMore(num.nextInt(), num.nextInt());
    }

    static void numberMore(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
