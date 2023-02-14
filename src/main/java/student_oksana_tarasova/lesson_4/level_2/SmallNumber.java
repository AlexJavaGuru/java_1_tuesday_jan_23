package student_oksana_tarasova.lesson_4.level_2;

import java.util.Scanner;

class SmallNumber {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter two numbers...");
        SmallNumber.numberSmall(num.nextInt(), num.nextInt());
    }

    static void numberSmall(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}

