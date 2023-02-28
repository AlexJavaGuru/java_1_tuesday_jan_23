package student_andrejs_cekalins.lesson_5.level_2.Task_14;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomNumbAverage {
    public static void main(String[] args) {
        int[] results = new int[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            results[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(results));
        double averageValue = 0;
        for (int y = 0; y < 3; y++)
            averageValue += results[y] / 2;
        System.out.println("Random numbers average value = " + averageValue);
    }
}
