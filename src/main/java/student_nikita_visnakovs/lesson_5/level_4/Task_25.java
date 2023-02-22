package student_nikita_visnakovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {

        System.out.println("Enter arrays length..");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        System.out.println("Enter numbers in arrays");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
