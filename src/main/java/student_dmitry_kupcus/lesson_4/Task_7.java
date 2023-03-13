package student_dmitry_kupcus.lesson_4;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber != secondNumber) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
