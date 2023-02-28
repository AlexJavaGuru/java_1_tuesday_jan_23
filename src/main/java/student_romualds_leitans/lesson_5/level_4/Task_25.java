package student_romualds_leitans.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину масива: ");
        int nums = scanner.nextInt();

        int[] numbers = new int[nums];

        for (int i = 0; i < nums; i++) {

            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива" + Arrays.toString(numbers));
    }
}