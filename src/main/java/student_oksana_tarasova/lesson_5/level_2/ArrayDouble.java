package student_oksana_tarasova.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class ArrayDouble {



    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
            System.out.println("cell [" + i + "] = " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Double value cell [" + i + "] = " + (array[i] * 2));
        }
    }
}










