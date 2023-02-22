package student_nikita_visnakovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class Task_28 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[random.nextInt(10)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();

        }

        System.out.println(Arrays.toString(numbers));
        int minNum = numbers[0];

        for (int number : numbers) {
            if (number < minNum) {
                minNum = number;
            }
        }
        System.out.println(minNum);
    }
}
