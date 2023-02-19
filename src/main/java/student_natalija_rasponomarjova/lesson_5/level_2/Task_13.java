package student_natalija_rasponomarjova.lesson_5.level_2;

import java.util.Random;

class Task_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(30);
        }

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Total: " + sum);
    }
}