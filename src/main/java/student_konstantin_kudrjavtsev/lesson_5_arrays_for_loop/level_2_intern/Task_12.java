package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

class Task_12 {
    public static void main(String[] args) {
        int[] kidsyears = new int[3];
        Random random = new Random();
        for (int i = 0; i < kidsyears.length; i++) {
            kidsyears[i] = random.nextInt(100);
            kidsyears[0] = random.nextInt();
            kidsyears[1] = random.nextInt();
            kidsyears[2] = random.nextInt();

            System.out.println(random.nextInt(100));
        }
    }
}