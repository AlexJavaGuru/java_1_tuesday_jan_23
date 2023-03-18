package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length");
        int[] numbers = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("Array cell: " + numbers[i]);
        }
    }
}