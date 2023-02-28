package student_nikita_visnakovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {

        int[] randomNum = new int[3];
        Random random = new Random();

        randomNum[0] = random.nextInt();
        randomNum[1] = random.nextInt();
        randomNum[2] = random.nextInt();

        System.out.println(Arrays.toString(randomNum));

        int averageNum = (randomNum[0] = randomNum[1] + randomNum[2]) / 3;

        System.out.println("Average = " + averageNum);
    }
}
