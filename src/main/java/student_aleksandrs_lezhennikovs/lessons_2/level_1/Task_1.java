package student_aleksandrs_lezhennikovs.lessons_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first integer number: ");
        int fistNumber = scanner.nextInt();

        System.out.println("Input second integer number: ");
        int secondNumber = scanner.nextInt();

        int sumResult = fistNumber + secondNumber;
        int subtrResult = fistNumber - secondNumber;
        if (secondNumber == 0) {
            System.out.println("Not allowed divide by zero");
        } else {
            double divResult = fistNumber / (double)secondNumber;
            System.out.println("Dividing result is: " + divResult);
        }
        int multResult = fistNumber * secondNumber;

        System.out.println("SUM result is: " + sumResult);
        System.out.println("Subtraction result is: " + subtrResult);
        System.out.println("Multiplying result is: " + multResult);
    }
}
