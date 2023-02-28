package student_natalja_semitseva.lesson_5_level_4;

import java.util.Arrays;
import java.util.Random;

public class Task_30 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
        int odd = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(" Number Odd: " + numbers[i]);
            }
        }
    }
}
