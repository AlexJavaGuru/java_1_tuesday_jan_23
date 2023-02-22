package student_vladislav_romanov.lesson_5.level_2;

import java.util.Random;

class Task_13 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        int arraySum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        for (int number : numbers) {
            arraySum += number;
        }

        System.out.println(arraySum);
    }

}
