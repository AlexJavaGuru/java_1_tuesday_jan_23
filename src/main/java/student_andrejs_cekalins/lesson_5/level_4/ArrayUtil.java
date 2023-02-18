package student_andrejs_cekalins.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayUtil {
    public static void main(String[] args) {
        Scanner arrayLength_input = new Scanner(System.in);
        System.out.print("Please enter array length: ");
        int arrayLength = arrayLength_input.nextInt();
        Random random = new Random();
        int[] results = new int[arrayLength];

        int maxNumber = results[0];
        int minNumber = results[0];
        int evenNumber;
        int oddNumber;
        for (int i = 0; i < arrayLength; i++) {
            results[i] = random.nextInt(100);
            if (results[i] % 2 == 0) {
                evenNumber = results[i];
                System.out.println(evenNumber + " is even number");
            }
            if (results[i] % 2 != 0) {
                oddNumber = results[i];
                System.out.println(oddNumber + " is odd number");
            }
            if (results[i] > maxNumber) {
                maxNumber = results[i];

            }
            if (i > 0) {
                if (results[i] < results[0]) {
                    minNumber = results[i];
                }
            }
        }
        System.out.println(Arrays.toString(results));
        System.out.println("Largest number is: " + maxNumber);
        System.out.println("Smallest number is: " + minNumber);
    }
}
