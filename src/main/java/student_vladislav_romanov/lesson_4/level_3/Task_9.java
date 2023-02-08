package student_vladislav_romanov.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input three numbers: ");

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first < second && second < third) {
            System.out.println("Increasing");
        } else if (first > second && second > third) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
