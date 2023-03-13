package student_daniels_belejuns.lesson_5.level_4;

public class task_29 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 8, 9, 10, -2, -3};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Число: " + array[i]);
            }
        }
    }
}