package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber <= secondNumber && secondNumber <= thirdNumber) {
            System.out.println(" Number " + firstNumber + " increasing");

        } else if (firstNumber >= secondNumber && secondNumber >= thirdNumber) {
            System.out.println(" Number " + firstNumber + " decreasing");

        } else {
            System.out.println("Neither increasing or decreasing order");

        }
    }
}
