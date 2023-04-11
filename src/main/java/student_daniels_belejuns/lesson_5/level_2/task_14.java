package student_daniels_belejuns.lesson_5.level_2;

import java.util.Random;

public class task_14 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
            System.out.println(average);
        }
        average /= array.length;
        System.out.println("Average value :" + average);
    }
}

