package student_natalija_rasponomarjova.lesson_5.level_7;

import java.util.Arrays;
import java.util.Scanner;

class Task26_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length: ");
        int length = scanner.nextInt();
        System.out.println("Array length: " + length);
        int[] numbers = arrayUtil.createArray(length);
        arrayUtil.fillArrayWithRandomNumbers(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
