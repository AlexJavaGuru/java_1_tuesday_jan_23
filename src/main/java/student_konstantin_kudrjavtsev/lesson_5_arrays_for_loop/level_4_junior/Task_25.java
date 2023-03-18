package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length: ");
        int[] numbers = new int[scanner.nextInt()];
        System.out.println("enter numbers for arrays: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println("Array cell: " + numbers[i]);
        }
    }
}
