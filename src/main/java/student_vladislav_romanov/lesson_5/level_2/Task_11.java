package student_vladislav_romanov.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
