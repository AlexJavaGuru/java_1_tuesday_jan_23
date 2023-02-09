package student_natalija_rasponomarjova.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 < number2 && number2 < number3) {
            System.out.println("Increasing order");
        }

        if(number1 > number2 && number2 > number3) {
            System.out.println("Decreasing order");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
