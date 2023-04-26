package student_oksana_tarasova.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");

        try {
            int number = scanner.nextInt();
            if (number == (int) number) {
                System.out.println(number + number);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Enter integer, please..");
        }
    }
}
