package student_dmitry_kupcus.lesson_4;

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter first number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("First number is lower then second number:");
            System.out.println(firstNumber + "<" + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("Second number is lower then first number:");
            System.out.println(firstNumber + ">" + secondNumber);
        } else {
            System.out.println("Equality:");
            System.out.println(firstNumber + "=" + secondNumber);
        }
    }
}
