package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

class Task_14 {
    public static void main(String[] args) {
        int[] kidsyears = new int[3];
        Random random = new Random();

        for (int i = 0; i < kidsyears.length; i++) {
            kidsyears[i] = random.nextInt(100);
            System.out.println("Array cell: " + kidsyears[i]);
        }


/*        int min = kidsyears[0];
        for (int i = 0; i < kidsyears.length; i++) {
            if (min > kidsyears[i]) ;
            {
                min = kidsyears[i];
                System.out.println("Min: " + min);
            }
        }

        int max = kidsyears[0];
        for (int i = 0; i < kidsyears.length; i++) {
            if (max < kidsyears[i]) ;
            {
                max = kidsyears[i];
                System.out.println("Max: " + max);
            }
        }
*/
        double average = 0;
        for (int i = 0; i < kidsyears.length; i++) {
            average += kidsyears[i] / kidsyears.length;
            System.out.println("Average: " + average);
        }
    }
}