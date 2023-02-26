package student_natalija_rasponomarjova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length: ");
        int length = scanner.nextInt();
        System.out.println("Array length: " + length);
        int[] numbers = new int[length];


        for (int i = 0; i < length; i++) {
            System.out.println("Please, enter number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
