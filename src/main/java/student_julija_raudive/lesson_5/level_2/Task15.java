package student_julija_raudive.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task15 {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            array[i] = random.nextInt(100);

        }

        System.out.println(Arrays.toString(array));


        for (int i = 0; i < 3; i++) {

            array[i] = array[i] + 2;
        }


        System.out.println(Arrays.toString(array));


    }
}
