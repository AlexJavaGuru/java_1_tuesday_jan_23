package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;

class Task_28 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(1, 10)];
        int minNumber = 100;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(minNumber);
        }

        for (int number : numbers) {
            System.out.println(number);
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("Min number in array is " + minNumber);
    }

}
