package student_natalija_rasponomarjova.lesson_5.level_2;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(50);
            System.out.println(numbers[i]);

        }
        System.out.println();
        int numberPlus2 = 0;
        for (int number : numbers) {
            System.out.println(numberPlus2 = number + 2);
        }
    }
}


