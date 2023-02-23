package student_oleg_gryazev.lesson_5.level_4;

import java.util.Scanner;

class Massive1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter massive length");

        int len = scanner.nextInt();
        int[] num = new int[len + 1];
        System.out.println("Enter your numbers");
        for (int i = 0; i <= len; ++i) {
            int number = scanner.nextInt();

            num[i] = number;
            System.out.println("Your numbers are in order of array elements:\nelement massive num [" + i + "] = " + num[i]);
        }

    }
}
