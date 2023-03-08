package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;


class Task_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] kidsyears = new int[3];
        kidsyears[0] = random.nextInt();
        kidsyears[1] = random.nextInt();
        kidsyears[2] = random.nextInt();
        int result = kidsyears[0] + kidsyears[1] + kidsyears[2];
        System.out.println("Summa: " + result);
        System.out.println(random.nextInt(3));
    }
}