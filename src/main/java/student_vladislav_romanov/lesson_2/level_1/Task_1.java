package student_vladislav_romanov.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        System.out.println(firstValue + " / " + secondValue + " = " + ( (double) firstValue / secondValue));
    }

}
