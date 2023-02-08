package student_vladislav_romanov.lesson_2.level_3;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3 values. The first one: ");
        int firstValue = scanner.nextInt();

        System.out.print("The second one: ");
        int secondValue = scanner.nextInt();

        System.out.print("The third one: ");
        int thirdValue = scanner.nextInt();

        double averageValue = (firstValue + secondValue + thirdValue) / 3.0;

        System.out.println("Average = " + averageValue);
    }

}
