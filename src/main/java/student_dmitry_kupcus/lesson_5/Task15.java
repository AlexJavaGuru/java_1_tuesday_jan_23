package student_dmitry_kupcus.lesson_5;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        System.out.println("First number is: " + numbers[0]);
        System.out.println("Second number is: " + numbers[1]);
        System.out.println("Third number is: " + numbers[2] + "\n");
        numbers[0] = numbers[0] + 2;
        numbers[1] = numbers[1] + 2;
        numbers[2] = numbers[2] + 2;
        System.out.println("First number + 2 is: " + numbers[0]);
        System.out.println("Second number +2 is: " + numbers[1]);
        System.out.println("Third number +2 is: " + numbers[2]);
    }
}
