package student_natalija_rasponomarjova.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int max;

        max = number1;
        if ((number1 > 0) && (number2 < number1) && (number3 < number1)) {
            System.out.println("Maximal number is: " + max);
        }

        max = number2;
        if ((number2 > 0) && (number1 < number2) && (number3 < number2)) {
            System.out.println("Maximal number is: " + max);
        }

        max = number3;
        if ((number3 > 0) && (number1 < number3) && (number2 < number3)) {
            System.out.println("Maximal number is: " + max);
        }
    }
}
