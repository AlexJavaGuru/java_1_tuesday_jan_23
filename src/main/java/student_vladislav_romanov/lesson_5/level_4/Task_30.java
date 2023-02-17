package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;

class Task_30 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(1, 10)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Odd numbers in array:");

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

    }

}
