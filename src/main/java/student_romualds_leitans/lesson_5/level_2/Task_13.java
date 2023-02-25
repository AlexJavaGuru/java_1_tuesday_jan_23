package student_romualds_leitans.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_13 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of all cells : " + sum);
    }
}