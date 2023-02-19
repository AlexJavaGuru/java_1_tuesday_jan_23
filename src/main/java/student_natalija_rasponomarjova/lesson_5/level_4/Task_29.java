package student_natalija_rasponomarjova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_29 {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(500);
        }
        System.out.println("Random array is: " + Arrays.toString(numbers));
        System.out.println();


        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number is: " + number);
            }
        }
    }
}
