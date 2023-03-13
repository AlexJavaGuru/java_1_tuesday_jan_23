package student_natalija_rasponomarjova.lesson_5.level_7;

import java.util.Arrays;

class Task30_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(9);
        arrayUtil.fillArrayWithRandomNumbers(numbers);

        System.out.println("Random array is: " + Arrays.toString(numbers));
        System.out.println();

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Odd number is: " + number);
            }
        }
    }
}
