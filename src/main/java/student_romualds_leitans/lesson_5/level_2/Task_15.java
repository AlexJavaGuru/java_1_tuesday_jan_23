package student_romualds_leitans.lesson_5.level_2;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] array = new int[3];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(10);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
            System.out.println("The value of each cell after increasing by 2: " + array[i]);

        }




    }
}
