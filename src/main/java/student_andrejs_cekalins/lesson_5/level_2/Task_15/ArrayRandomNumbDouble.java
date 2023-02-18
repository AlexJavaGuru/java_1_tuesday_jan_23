package student_andrejs_cekalins.lesson_5.level_2.Task_15;

import java.util.Random;

public class ArrayRandomNumbDouble {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumbers = random.nextInt(100);
            System.out.println("Random numbers = " + randomNumbers);
            int multipliedNumbers = randomNumbers * 2;
            System.out.println("2 x Random numbers  = " + multipliedNumbers);
        }
    }
}