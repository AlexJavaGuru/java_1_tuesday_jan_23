package student_vladislav_romanov.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");

        int value = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(value + " x " + i + " = " + (value * i));
        }
    }

}
