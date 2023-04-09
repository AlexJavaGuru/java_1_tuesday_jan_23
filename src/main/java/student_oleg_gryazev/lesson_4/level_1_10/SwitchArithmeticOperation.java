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
            System.out.println("Choose tested digits");
            switch (option) {
                case 1 ->
                    operation.negativePositiveOrZero();

                case 2 ->
                    operation.ifDigitEvenOrQdd();

                case 3 ->
                    operation.ifBiggerSmallerEqual();

                case 4 ->

                    operation.ifEqualDifferentOrNotAll();

                case 5 ->

                    operation.ifIncreasingDecreasingOrNotAll();

                case 6 -> {
                    System.out.println("Quit the program");
                    isContinue = false;
                }

                default -> System.out.println("No such option");
            }
        }
    }
}
