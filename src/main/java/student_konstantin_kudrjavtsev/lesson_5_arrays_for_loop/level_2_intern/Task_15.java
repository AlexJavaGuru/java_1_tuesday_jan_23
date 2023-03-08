package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] kidsyears = new int[3];
        Random random = new Random();
        for (int i = 0; i < kidsyears.length; i++) {
            kidsyears[i] = random.nextInt(45);
            System.out.println("Array cell: " + kidsyears[i]);
        }
    }
}