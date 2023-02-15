package student_aleksandrs_lezhennikovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Input three elements to array:");

        int[] numbers = putRandomElements(random, 3);
        int[] numbers2 = putRandomElements(random, 4);

        System.out.println("Your array: " + Arrays.toString(numbers));
        System.out.println("Your array: " + Arrays.toString(numbers2));

        System.out.println("Your array: " + Arrays.toString(incrementElementsByTwo(numbers)));
        System.out.println("Your array: " + Arrays.toString(incrementElementsByTwo(numbers2)));
}

    private static int[] putRandomElements(Random random, int sizeOfArray) {
        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            numbers[i] = random.nextInt(10);
        }
        return numbers;
    }

    private static int[] incrementElementsByTwo(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }
        return numbers;
    }
}
