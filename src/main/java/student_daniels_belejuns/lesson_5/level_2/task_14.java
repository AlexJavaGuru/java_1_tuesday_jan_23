package student_daniels_belejuns.lesson_5.level_2;

public class task_14 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 2};
        int result = 0;
        for (int m : nums) {
            result += m;

        }
        System.out.println("среднее значение = " + result / nums.length);
    }
}
