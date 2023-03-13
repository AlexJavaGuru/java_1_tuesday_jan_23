package student_natalja_semitseva.lesson_5_level_2;

import java.util.Arrays;
import java.util.Scanner;

class ArrayTask_11 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        int[] numbers = new int[3];
        Scanner num = new Scanner(System.in);

        numbers[0] = num.nextInt();
        numbers[1] = num.nextInt();
        numbers[2] = num.nextInt();

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }
}
