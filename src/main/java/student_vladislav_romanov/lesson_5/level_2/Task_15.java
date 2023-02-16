package student_vladislav_romanov.lesson_5.level_2;

import java.util.Random;

class Task_15 {

    static int[] numbers = new int[3];
    static Random random = new Random();

    public static void main(String[] args) {

        setNumbers();
        printArray();
        setNumbers(2);
        printArray();

    }

    public static void printArray() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void setNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
    }

    public static void setNumbers(int step) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += step;
        }
    }

}
