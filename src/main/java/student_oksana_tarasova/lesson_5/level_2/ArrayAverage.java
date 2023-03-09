package student_oksana_tarasova.lesson_5.level_2;

import java.util.Random;

class ArrayAverage {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
