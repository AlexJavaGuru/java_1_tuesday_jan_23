package student_julija_raudive.lesson_5.level_2;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            System.out.println(array[i] = random.nextInt(100));


        }

        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        System.out.println(sum);


    }
}
