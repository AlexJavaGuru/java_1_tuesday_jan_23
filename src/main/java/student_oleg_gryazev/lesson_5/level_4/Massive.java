package student_oleg_gryazev.lesson_5.level_4;


import java.util.Random;
import java.util.Scanner;

class Massive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenghts massive to fill it in automatically");
        int len = scanner.nextInt();

        int[] num = new int[len + 1];

        for (int i = 0; i <= len; ++i) {
            Random random = new Random();
            int number = random.nextInt(100);
            num[i] = number;
            System.out.println("Your numbers are in order of array elements:\nelement massive num [" + i + "] = " + num[i]);
        }

    }
}
