package student_natalija_rasponomarjova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_30 {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(350);
        }
        System.out.println("Random array is: " + Arrays.toString(numbers));
        System.out.println();

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Odd number is: " + number);
            }
        }
    }
}
