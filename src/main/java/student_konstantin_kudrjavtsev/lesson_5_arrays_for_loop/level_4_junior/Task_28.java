package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arbitraryLength = new int[random.nextInt(15)];

        for (int i = 0; i < arbitraryLength.length; i++) {
            System.out.println(i);
        }

        int min = arbitraryLength[0];
        for (int i = 0; i < arbitraryLength.length; i++) {
            if (min > arbitraryLength[i]); {
                min = arbitraryLength[i];
                System.out.println("smallest number: " + min);
            }
        }
    }
}
