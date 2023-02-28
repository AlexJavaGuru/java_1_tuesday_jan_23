package student_oksana_maksimova.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();


        if (firstNumber > secondNumber) {
            System.out.println("The larger number is " + firstNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println("The larger number is " + secondNumber);
        }
    }
}

