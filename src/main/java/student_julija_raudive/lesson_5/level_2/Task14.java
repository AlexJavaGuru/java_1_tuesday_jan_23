package student_julija_raudive.lesson_5.level_2;

import java.util.Random;

class Task14 {

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

        double average = (double) sum / array.length;

        System.out.println(average);

    }
}
