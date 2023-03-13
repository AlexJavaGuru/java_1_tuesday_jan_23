package student_aleksandrs_lezhennikovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Input three elements to array:");

        int[] numbers = new int[3];
        numbers[0] = random.nextInt(10);
        numbers[1] = random.nextInt(10);
        numbers[2] = random.nextInt(10);

        System.out.println("Your array: " + Arrays.toString(numbers));
    }
}
