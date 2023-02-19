package student_romualds_leitans.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_30 {
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
            if (numbers[i] % 2 != 1) continue;
            System.out.println("Вывод нечетного числа: " + numbers[i]);

        }
    }
}

//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите все нечётные числа в массиве и выведети их на консоль.