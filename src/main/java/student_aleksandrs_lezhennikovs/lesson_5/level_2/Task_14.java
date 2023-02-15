package student_aleksandrs_lezhennikovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_14 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Input three elements to array:");

        int[] numbers = putRandomElements(random, 2);
        int[] numbers2 = putRandomElements(random, 4);

        System.out.println("Your array: " + Arrays.toString(numbers));
        System.out.println("Your array: " + Arrays.toString(numbers2));

        double result = avgOfElements(numbers);
        double result2 = avgOfElements(numbers2);

        System.out.println("Sum of arrays element is: " + result);
        System.out.println("Sum of arrays element is: " + result2);
    }

    private static int[] putRandomElements(Random random, int sizeOfArray) {
        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            numbers[i] = random.nextInt(10);
        }
        return numbers;
    }

    private static double avgOfElements(int[] numbers) {

        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result / (double)numbers.length;
    }

    private static double avgOfElementsTest(int[] numbers) {

        double result = 0;
        for (int i : numbers) {
            result += numbers[i];
        }
        return result / (double)numbers.length;
    }
}
}
