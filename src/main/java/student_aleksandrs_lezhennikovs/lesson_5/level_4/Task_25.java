package student_aleksandrs_lezhennikovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array:");
        int arraySize = input.nextInt();
        int[] numbers = new int[arraySize];

        for (int count = 0; count < arraySize; count++) {
            System.out.println("Please input element of array:");
            numbers[count] = input.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(numbers));
    }
}
