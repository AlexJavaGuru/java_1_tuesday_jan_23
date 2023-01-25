package student_vladislav_romanov.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstValue = scanner.nextDouble();
        double secondValue = scanner.nextDouble();

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
    }

}
