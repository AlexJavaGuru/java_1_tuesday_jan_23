package student_andrejs_cekalins.lesson_5.level_2.Task_14;

import java.util.Random;

public class ArrayRandomNumbAverage {
    public static void main(String[] args) {
        int averageValue = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumbers = random.nextInt(100);
            System.out.println(randomNumbers);
            averageValue += randomNumbers / 2;
        }
        System.out.println("Random numbers average value = " + averageValue);
    }
}
