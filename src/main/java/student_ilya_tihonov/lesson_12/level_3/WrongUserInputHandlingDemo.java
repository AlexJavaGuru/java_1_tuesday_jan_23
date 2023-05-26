package student_ilya_tihonov.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }

        System.out.println("You entered a number: " + number);
    }
}

