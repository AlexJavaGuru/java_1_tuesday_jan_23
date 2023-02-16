package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;

class Task_30 {

    public static void main(String[] args) {
        int[] numbers;

        int arrayLength;
        Random random = new Random();

        arrayLength = random.nextInt(1, 10);
        numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
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
