package student_natalija_rasponomarjova.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number %2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }
}
