package student_vladislav_romanov.lesson_2.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int firstValue = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int secondValue = scanner.nextInt();

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        System.out.println(firstValue + " / " + secondValue + " = " + ( (double) firstValue / secondValue));
    }

}
