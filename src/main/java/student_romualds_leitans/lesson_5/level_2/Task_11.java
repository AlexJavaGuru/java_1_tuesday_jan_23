package student_romualds_leitans.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Введите первое число: ");
            numbers[0] = scanner.nextInt();

            System.out.print("Введите второе число: ");
            numbers[1] = scanner.nextInt();

            System.out.print("Введите третье число: ");
            numbers[2] = scanner.nextInt();
            break;
        }

        System.out.println("Ячейка номер один: " + numbers[0]);
        System.out.println("Ячейка номер два: " + numbers[1]);
        System.out.println("Ячейка номер три: " +numbers[2]);
    }
}

