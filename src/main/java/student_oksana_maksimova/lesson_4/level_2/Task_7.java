package student_oksana_maksimova.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();


        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        }
        else if (firstNumber != secondNumber) {
            System.out.println("Numbers are different");
        }
    }
}
