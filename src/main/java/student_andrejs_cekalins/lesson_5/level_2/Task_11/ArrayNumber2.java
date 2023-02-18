package student_andrejs_cekalins.lesson_5.level_2.Task_11;

import java.util.Arrays;
import java.util.Scanner;

class ArrayNumber2 {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int firstIntegerNumber = number_input.nextInt();
        System.out.print("Enter second integer number: ");
        int secondIntegerNumber = number_input.nextInt();
        System.out.print("Enter third integer number: ");
        int thirdIntegerNumber = number_input.nextInt();

        int[] numbers = new int[3];
        numbers[0] = firstIntegerNumber;
        numbers[1] = secondIntegerNumber;
        numbers[2] = thirdIntegerNumber;
        System.out.print(Arrays.toString(numbers));

    }
}
