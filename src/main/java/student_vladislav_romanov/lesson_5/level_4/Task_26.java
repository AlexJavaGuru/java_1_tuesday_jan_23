package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Please enter array length: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
