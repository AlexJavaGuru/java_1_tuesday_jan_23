package student_vladislav_romanov.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input three numbers: ");

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first);
        } else if (first < second && second > third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }

}
