package student_vladislav_romanov.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");

        int value = scanner.nextInt();

        if (value > 0) {
            System.out.println("Ваше число положительное");
        } else if (value < 0) {
            System.out.println("Ваше число отрицательное");
        } else {
            System.out.println("0 не является ни положительным, ни отрицательным числом");
        }
    }

}
