package student_andrejs_cekalins.lesson_12.level_3.Task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Please enter integer number: ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("You entered not integer number! Please enter integer number: ");
            }
        }
    }
}

