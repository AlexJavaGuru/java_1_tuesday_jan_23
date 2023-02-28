package student_andrejs_cekalins.lesson_5.level_4.Task_28;

import java.util.Arrays;
import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        int[] results = new int[5];
        Random random = new Random();
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(results));
        int minNumber = results[0];
        for (int y = 0; y < results.length; y++) {
            if (results[y] < minNumber) {
                minNumber = results[y];
            }
        }
        System.out.println("Smallest number is: " + minNumber);
    }
}
