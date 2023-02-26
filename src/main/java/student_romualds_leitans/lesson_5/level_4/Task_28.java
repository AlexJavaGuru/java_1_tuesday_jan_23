package student_romualds_leitans.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_28 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Числа: " + numbers[i]);
        }
        System.out.println("все элементы массива :" + Arrays.toString(numbers));

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Наименьшее число в массиве: " + min);
    }
}
