package student_nikita_visnakovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class Task_13 {

    public static void main(String[] args) {

        int[] randomNum = new int[3];
        Random random = new Random();

        randomNum[0] = random.nextInt();
        randomNum[1] = random.nextInt();
        randomNum[2] = random.nextInt();

        int sum = randomNum[0] + randomNum[1] + randomNum[2];

        System.out.println(Arrays.toString(randomNum));
        System.out.println("Sum = " + sum);
    }
}
