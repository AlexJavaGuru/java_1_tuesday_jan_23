package student_romualds_leitans.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВедите длину массива : ");
        int nums = scanner.nextInt();

        int[] numbers = new int[nums];

        Random random = new Random();

        for (int i = 0; i < nums; i++) {
            System.out.println("Число : " + random.nextInt());
            numbers[i] = random.nextInt();
        }
        System.out.println("Элементы массива :" + Arrays.toString(numbers));
    }
}

