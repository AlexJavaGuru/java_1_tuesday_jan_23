package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber >= secondNumber) {
            System.out.println(firstNumber);

        } else if (firstNumber <= secondNumber) {
            System.out.println(secondNumber);

        }

    }

}
