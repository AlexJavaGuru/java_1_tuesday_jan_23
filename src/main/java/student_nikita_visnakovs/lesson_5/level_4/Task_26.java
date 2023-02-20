package student_nikita_visnakovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {

        System.out.println("Enter arrays length..");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
