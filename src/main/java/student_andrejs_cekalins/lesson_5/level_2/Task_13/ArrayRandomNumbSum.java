package student_andrejs_cekalins.lesson_5.level_2.Task_13;

import java.util.Random;

class ArrayRandomNumbSum {
    public static void main(String[] args) {
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumbers = random.nextInt(100);
            System.out.println(randomNumbers);
            sum += randomNumbers;
        }
        System.out.println("Random numbers sum = " + sum);
    }
}

