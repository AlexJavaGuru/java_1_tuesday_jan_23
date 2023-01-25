package student_vladislav_romanov.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 values:");

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();

        double averageValue = (firstValue + secondValue + thirdValue) / 3.0;

        System.out.println("Average = " + averageValue);
    }

}
