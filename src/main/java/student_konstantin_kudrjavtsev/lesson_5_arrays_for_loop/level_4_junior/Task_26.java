package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int[] arrays = new int[input.nextInt()];

        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt();
            System.out.println("Array cell: " + i);
        }
    }
}