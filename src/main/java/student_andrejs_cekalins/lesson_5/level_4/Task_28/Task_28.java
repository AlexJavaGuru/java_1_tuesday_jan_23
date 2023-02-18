package student_andrejs_cekalins.lesson_5.level_4.Task_28;

import java.util.Arrays;
import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        int[] results = new int[10];
        Random random = new Random();
        int minNumber = results[0];
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(100);
            if (i > 0) {
                if (results[i] < results[0]) {
                    minNumber = results[i];
                }
            }
        }
        System.out.println(Arrays.toString(results));
        System.out.println("Smallest number is: " + minNumber);
    }
}
