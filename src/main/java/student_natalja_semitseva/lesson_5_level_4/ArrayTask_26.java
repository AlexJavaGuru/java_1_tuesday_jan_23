package student_natalja_semitseva.lesson_5_level_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayTask_26 {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
