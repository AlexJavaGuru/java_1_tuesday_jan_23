package student_aleksandrs_lezhennikovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input size of array:");
        int arraySize = input.nextInt();
        int[] numbers = new int[arraySize];

        for (int count = 0; count < arraySize; count++) {
            numbers[count] = random.nextInt(10);
        }

        System.out.println("Your array: " + Arrays.toString(numbers));
    }
}
