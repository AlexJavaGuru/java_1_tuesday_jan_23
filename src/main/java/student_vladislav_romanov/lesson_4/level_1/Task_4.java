package student_vladislav_romanov.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");

        int value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.println("Ваше число чётное");
        } else {
            System.out.println("Ваше число нечётное");
        }
    }

}
