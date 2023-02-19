package student_romualds_leitans.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_14 {
    public static void main(String[] args) {
        int[] nums = new int[3];

        Random random = new Random();

        nums[0] = random.nextInt(50);
        nums[1] = random.nextInt(50);
        nums[2] = random.nextInt(50);

        System.out.println("Random namber 1: " +nums[0]);
        System.out.println("Random namber 2: " +nums[1]);
        System.out.println("Random namber 3: " +nums[2]);

        System.out.println("Среднее значение : " + Arrays.stream(nums).average());
    }
}
