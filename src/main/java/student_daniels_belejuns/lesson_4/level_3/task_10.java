package student_daniels_belejuns.lesson_4.level_3;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a;
            int b;
            int c;
            int max;
            System.out.println("Iput A");
            a = input.nextInt();
            System.out.println("Iput B");
            b = input.nextInt();
            System.out.println("Iput C");
            c = input.nextInt();

            max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }

            System.out.println("Max = " + max);
        }
    }
}
