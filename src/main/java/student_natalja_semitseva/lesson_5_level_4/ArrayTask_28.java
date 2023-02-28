package student_natalja_semitseva.lesson_5_level_4;

import java.util.Arrays;

import java.util.Random;

public class ArrayTask_28 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int min = numbers[0];

        for (int j = 1; j < numbers.length; j++) {

            if (numbers[j] > min) {
                min = numbers[j];
            }
        }
        System.out.println(min);

    }
}






