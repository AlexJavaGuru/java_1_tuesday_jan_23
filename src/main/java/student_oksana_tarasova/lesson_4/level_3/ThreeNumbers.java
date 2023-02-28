package student_oksana_tarasova.lesson_4.level_3;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter three numbers...");
        ThreeNumbers.numbersThree(num.nextInt(), num.nextInt(), num.nextInt());
    }

    static void numbersThree(int num1, int num2, int num3) {

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
