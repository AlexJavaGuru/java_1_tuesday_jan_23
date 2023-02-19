package student_romualds_leitans.lesson_5.level_2;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] nums = new int[3];

        Random random = new Random();

        nums[0] = random.nextInt(10);
        nums[1] = random.nextInt(10);
        nums[2] = random.nextInt(10);

        System.out.println("Random namber 1: " + nums[0]);
        System.out.println("Random namber 2: " + nums[1]);
        System.out.println("Random namber 3: " + nums[2]);

        for (int i = 0; i < nums.length; i++) ;
        {
            nums[0] += 2;
            nums[1] += 2;
            nums[2] += 2;

            System.out.println("Random namber 1(+2): " + nums[0]);
            System.out.println("Random namber 2(+2): " + nums[1]);
            System.out.println("Random namber 3(+2): " + nums[2]);
        }
    }
}
