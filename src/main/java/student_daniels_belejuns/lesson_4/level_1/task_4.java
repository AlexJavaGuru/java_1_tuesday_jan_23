package student_daniels_belejuns.lesson_4.level_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int number;
        System.out.println("Целое число: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
}
