package student_andrejs_cekalins.lesson_5.level_4.Task_30;

import java.util.Arrays;
import java.util.Random;

class Task_30 {
    public static void main(String[] args) {
        int[] results = new int[7];
        Random random = new Random();
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(100);
            {
            }
            if (results[i] % 2 != 0) {
                System.out.println("Odd numbers are: " + results[i]);
            }
        }
        System.out.println(Arrays.toString(results));
    }
}
