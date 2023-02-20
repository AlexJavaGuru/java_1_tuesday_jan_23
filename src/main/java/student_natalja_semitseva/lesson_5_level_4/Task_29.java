package student_natalja_semitseva.lesson_5_level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)

                System.out.println(" Number Even: " + numbers[i]);
        }
    }
}









