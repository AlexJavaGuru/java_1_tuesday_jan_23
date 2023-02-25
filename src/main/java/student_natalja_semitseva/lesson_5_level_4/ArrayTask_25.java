package student_natalja_semitseva.lesson_5_level_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class ArrayTask_25 {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner random = new Scanner(System.in);
        int[] numbers = new int[random.nextInt()];

        System.out.println("enter numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
