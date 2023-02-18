package student_andrejs_cekalins.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayUtil {
    public static void main(String[] args) {
        Scanner arrayLengthInput = new Scanner(System.in);
        System.out.print("Please enter array length: ");
        int arrayLength = arrayLengthInput.nextInt();

        Random random = new Random();
        int[] results = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            results[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(results));
        int maxNumber = results[0];
        int minNumber = results[0];
        int evenNumber;
        int oddNumber;
        for (int y = 0; y < results.length; y++) {
            if (results[y] % 2 == 0) {
                evenNumber = results[y];
                System.out.println(evenNumber + " is even number");
            }
            if (results[y] % 2 != 0) {
                oddNumber = results[y];
                System.out.println(oddNumber + " is odd number");
            }
            if (results[y] > maxNumber) {
                maxNumber = results[y];
            }
            if (results[y] < minNumber) {
                minNumber = results[y];
            }
        }
        System.out.println("Largest number is: " + maxNumber);
        System.out.println("Smallest number is: " + minNumber);
    }
}
