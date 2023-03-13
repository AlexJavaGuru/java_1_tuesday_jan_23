package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        System.out.println("Average number from three numbers is: " + Arrays.stream(numbers).average());
    }
}
