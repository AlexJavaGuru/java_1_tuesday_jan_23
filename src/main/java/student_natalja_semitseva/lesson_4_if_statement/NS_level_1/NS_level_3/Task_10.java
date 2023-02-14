package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        // 1>2 1>3
        // 2>1 2>3
        // 3>1 3>2


        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Number " + firstNumber + " bigger");
            return;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Number " + secondNumber + " bigger");

        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Number " + thirdNumber + " bigger");

        }
    }
}
