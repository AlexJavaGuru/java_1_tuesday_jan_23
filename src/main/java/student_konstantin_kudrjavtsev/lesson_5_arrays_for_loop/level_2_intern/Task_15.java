package student_konstantin_kudrjavtsev.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(45);
            System.out.println("array cell: " + numbers[i]);
        }

        int result = numbers[0] + 2;
        int result2 = numbers[1] + 2;
        int result3 = numbers[2] + 2;
        System.out.println("cell increase by two: " + result);
        System.out.println("cell increase by two: " + result2);
        System.out.println("cell increase by two: " + result3);
    }
}