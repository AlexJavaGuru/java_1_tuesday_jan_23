package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_level_2;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println(firstNumber);
            System.out.println("Numbers are equals");
            return;

        } else if (secondNumber != firstNumber) ;
        System.out.println(secondNumber);
        System.out.println("Numbers are different");
        return;

    }

}
