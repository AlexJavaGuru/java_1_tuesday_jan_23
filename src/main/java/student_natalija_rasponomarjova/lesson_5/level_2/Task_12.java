package student_natalija_rasponomarjova.lesson_5.level_2;

import java.util.Random;

class Task_12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(20);
            System.out.println(numbers[i]);
        }
    }
}