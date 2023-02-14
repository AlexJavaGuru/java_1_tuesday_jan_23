package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();


        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println(firstNumber);
            System.out.println("All numbers are equals");
            return;
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
            return;
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
