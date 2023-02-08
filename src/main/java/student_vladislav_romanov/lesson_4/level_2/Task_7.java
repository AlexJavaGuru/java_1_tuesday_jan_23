package student_vladislav_romanov.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input two numbers: ");

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first == second) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }

}
