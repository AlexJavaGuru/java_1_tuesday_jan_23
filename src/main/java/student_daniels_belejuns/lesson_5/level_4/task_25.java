package student_daniels_belejuns.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of array");
        int arraySize = scan.nextInt();
        int[] numbers = new int[arraySize];
        for (int count = 0; count < arraySize; count++) {
            System.out.println("Element of array");
        }
        System.out.println("Your array" + Arrays.toString(numbers));
    }
}
