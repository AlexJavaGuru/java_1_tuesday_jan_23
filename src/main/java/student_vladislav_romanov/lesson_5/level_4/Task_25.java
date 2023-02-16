package student_vladislav_romanov.lesson_5.level_4;

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {
        int[] numbers;
        int arrayLength;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array length: ");
        arrayLength = scanner.nextInt();
        numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
