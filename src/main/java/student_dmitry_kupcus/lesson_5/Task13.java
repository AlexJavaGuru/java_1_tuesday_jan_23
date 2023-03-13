package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = {rand.nextInt(100),rand.nextInt(100),rand.nextInt(100)};
        System.out.println("Sum of first, second and third number is: " + Arrays.stream(numbers).sum());

    }
}
