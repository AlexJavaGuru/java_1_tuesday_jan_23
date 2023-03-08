package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length");
        int[] arrays = new int[input.nextInt()];

        for (int i = 0; i < arrays.length; i++ ) {
            System.out.println("Array cell: " + i);
        }
    }
}