package student_daniels_belejuns.lesson_5.level_2;

import static java.lang.Math.random;

public class task_12 {
    public static void main(String[] args) {

        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.println(array[i]);
        }

    }
}
