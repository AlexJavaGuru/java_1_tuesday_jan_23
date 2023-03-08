package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;

class Task_27 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arbitraryLength = new int[random.nextInt(10)];

        for (int i = 0; i < arbitraryLength.length; i++) {
            arbitraryLength[i] = random.nextInt();
            System.out.println("Arrays cell: " + i);
        }

        int max = arbitraryLength[0];
        for (int i = 0; i < arbitraryLength.length; i++) {
            if (max < arbitraryLength[i]) ; {
                max = arbitraryLength[i];
                System.out.println("Max: " + max);
            }
        }
    }
}