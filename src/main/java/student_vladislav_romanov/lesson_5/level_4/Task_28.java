package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;

class Task_28 {

    public static void main(String[] args) {
        int[] numbers;
        int arrayLength;
        int minNumber = 100;
        Random random = new Random();

        arrayLength = random.nextInt(1, 10);
        numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
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
