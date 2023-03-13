package student_daniels_belejuns.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class task_26 {
    public static void main(String[] args) {
        int[] array = new int[2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
