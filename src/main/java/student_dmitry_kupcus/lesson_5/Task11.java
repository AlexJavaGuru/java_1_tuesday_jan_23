package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please input second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Please input third number:");
        int thirdNumber = scanner.nextInt();

        int[] numbers = {firstNumber,secondNumber,thirdNumber};
        System.out.println(Arrays.toString(new int[]{numbers[0]}));
        System.out.println(Arrays.toString(new int[]{numbers[1]}));
        System.out.println(Arrays.toString(new int[]{numbers[2]}));
    }
}
