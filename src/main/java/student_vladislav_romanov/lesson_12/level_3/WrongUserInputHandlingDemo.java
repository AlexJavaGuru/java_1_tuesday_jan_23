package student_vladislav_romanov.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        System.out.print("Пожалуйста введите число: ");
        while(true) {
            if (isInputValid()) {
                break;
            }
        }
        System.out.println("Спасибо!");
    }

    public static boolean isInputValid() {
        Scanner scanner = new Scanner(System.in);
        try {
            scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Эээ, русским же языком попросили ввести ЧИСЛО. Введите ещё раз: ");
            return false;
        }
        return true;
    }

}
