package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;

class Task_27 {

    public static void main(String[] args) {
        int[] numbers;
        int arrayLength;
        int maxNumber = 0;
        Random random = new Random();

        arrayLength = random.nextInt(10);
        numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int number : numbers) {
            System.out.println(number);
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Max number in array is " + maxNumber);
    }

}
