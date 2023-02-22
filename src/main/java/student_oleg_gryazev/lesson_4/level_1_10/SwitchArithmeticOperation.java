package student_oleg_gryazev.lesson_4.level_1_10;

import java.util.Scanner;

public class SwitchArithmeticOperation {
    Scanner scanner = new Scanner(System.in);

    void switchOperation() {
        boolean isContinue = true;

        while (isContinue) {

            System.out.println("Select arithmetic option");
            int option = scanner.nextInt();
            ArithmeticOperation operation = new ArithmeticOperation();

            switch (option) {
                case 1 -> {
                    operation.typeInOneDigit();
                    operation.negativePositiveOrZero();
                    operation.ifDigitEvenOrQdd();
                }
                case 2 -> {
                    operation.typeInTwoDigits();
                    operation.ifBiggerSmallerEqual();
                }
                case 3 -> {
                    operation.typeInThreeDigits();
                    operation.ifEqualDifferentOrNotAll();
                }
                case 4 -> {
                    operation.typeInThreeDigits();
                    operation.ifIncreasingDecreasingOrNotAll();
                }
                case 5 -> {
                    System.out.println("Quit the program");
                    isContinue = false;
                }
                default -> System.out.println("No such option");
            }
        }
    }
}
