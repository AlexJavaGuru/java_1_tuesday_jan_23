package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Random;

class Task12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstNumber = rand.nextInt();
        int secondNumber = rand.nextInt();
        int thirdNumber = rand.nextInt();

        int[] numbers = {firstNumber,secondNumber,thirdNumber};
        System.out.println(Arrays.toString(new int[]{numbers[0]}));
        System.out.println(Arrays.toString(new int[]{numbers[1]}));
        System.out.println(Arrays.toString(new int[]{numbers[2]}));
    }
}
