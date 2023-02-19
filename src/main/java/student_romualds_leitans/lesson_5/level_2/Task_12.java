package student_romualds_leitans.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {
    public static void main(String[] args) {

        int[] nums = new int[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) ;{

            nums [0] = random.nextInt();
            nums [1] = random.nextInt(200);
            nums [2] = random.nextInt();

            System.out.println("Random namber 1: " +nums[0]);
            System.out.println("Random namber 2: " +nums[1]);
            System.out.println("Random namber 3: " +nums[2]);
        }
    }
}
