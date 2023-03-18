package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;


class Task_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int result = numbers[0] + numbers[1] + numbers[2];
        System.out.println("Summa: " + result);
    }
}
