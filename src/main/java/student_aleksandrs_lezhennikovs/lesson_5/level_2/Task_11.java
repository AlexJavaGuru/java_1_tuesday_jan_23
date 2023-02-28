package student_aleksandrs_lezhennikovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input three elements to array:");

        int[] numbers = new int[3];
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();

        System.out.println("Your array: " + Arrays.toString(numbers));
    }
}
