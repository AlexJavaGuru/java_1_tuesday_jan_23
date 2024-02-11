package student_oksana_maksimova.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();


        if (number % 2 == 0) {
            System.out.println("Is even number");
        }
        else {
            System.out.println("Is odd number");
        }
    }
}
