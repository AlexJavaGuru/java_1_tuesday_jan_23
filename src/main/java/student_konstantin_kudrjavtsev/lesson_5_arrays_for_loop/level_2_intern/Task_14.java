package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i] / numbers.length;
        }

        System.out.println("Average: " + average);
    }
}