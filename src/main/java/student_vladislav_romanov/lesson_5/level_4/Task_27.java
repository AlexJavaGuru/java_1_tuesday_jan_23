package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;

class Task_27 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(1, 10)];
        int maxNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
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
