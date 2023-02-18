package student_andrejs_cekalins.lesson_5.level_4.Task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner arrayLengthInput = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = arrayLengthInput.nextInt();
        int[] results = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            results[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(results));
    }
}
