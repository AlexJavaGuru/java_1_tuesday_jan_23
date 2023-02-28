package student_romualds_leitans.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_29 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();

        int i;
        for (i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Числа: " + numbers[i]);
        }
        System.out.println("все элементы массива:" + Arrays.toString(numbers));

        for (i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0)
                System.out.println("все чётные числа в массиве: " + numbers[i]);
        }
    }
}
