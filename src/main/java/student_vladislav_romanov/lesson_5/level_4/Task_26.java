package student_vladislav_romanov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {
        int[] numbers;
        int arrayLength;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Please enter array length: ");
        arrayLength = scanner.nextInt();
        numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(10);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
