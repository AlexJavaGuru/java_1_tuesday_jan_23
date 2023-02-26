package student_andrejs_cekalins.lesson_5.level_2.Task_13;

import java.util.Arrays;
import java.util.Random;

class ArrayRandomNumbSum {
    public static void main(String[] args) {
        int[] results = new int[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            results[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(results));
        int sum = 0;
        for (int y = 0; y < 3; y++)
            sum += results[y];
        System.out.println("Random numbers sum = " + sum);
    }
}

