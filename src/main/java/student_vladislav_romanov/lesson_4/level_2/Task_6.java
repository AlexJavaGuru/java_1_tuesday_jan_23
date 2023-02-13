package student_vladislav_romanov.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first <= second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }

}
