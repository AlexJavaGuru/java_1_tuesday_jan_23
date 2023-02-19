package student_oksana_tarasova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class EvenAndOddNumbersArray {
    public static void main(String[] args) {

        Random random = new Random();
        int size = random.nextInt(10);
        int[] numbers = new int[size];
        System.out.println("Length array: " + size);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(150);
        }
        System.out.println(Arrays.toString(numbers));

        String even = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += numbers[i] + "; ";
            }
        }
        System.out.println("Even numbers array: " + even);

        String odd = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd += numbers[i] + "; ";
            }
        }
        System.out.println("Odd numbers array: " + odd);
    }
}

