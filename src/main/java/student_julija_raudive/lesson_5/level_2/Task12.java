package student_julija_raudive.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class Task12 {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            array[i] = random.nextInt();
        }


        System.out.println(Arrays.toString(array));
    }
}
