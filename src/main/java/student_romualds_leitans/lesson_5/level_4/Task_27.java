package student_romualds_leitans.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_27 {
    public static void main(String[] args) {

        Random random = new Random();

        int nums = random.nextInt(10);

        int[] numbers = new int[nums];

        System.out.println("массив произвольной длины: " + nums);

        int i;
        for (i = 0; i < nums; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Произвольное число будет :" + numbers[i]);
        }
        System.out.println("Все элементы массива: " + Arrays.toString(numbers));

        int max = numbers[0];
        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Наибольшее число в массиве: " + max);
    }

}

//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наибольшее число в массиве и выведети его на консоль.
