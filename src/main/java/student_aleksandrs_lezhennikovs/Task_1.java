package student_aleksandrs_lezhennikovs;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // fist number
        System.out.println("Input first number: ");
        int fistNumber = scanner.nextInt();

        // second number
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();

        //calculation
        int sumResult = fistNumber + secondNumber; //SUM
        int subtrResult = fistNumber - secondNumber; //subtraction
        double divResult = fistNumber / (double)secondNumber; //Dividing
        int multResult = fistNumber * secondNumber; //Multiplying

        System.out.println("SUM result is: " + sumResult);
        System.out.println("Subtraction result is: " + subtrResult);
        System.out.println("Dividing result is: " + divResult);
        System.out.println("Multiplying result is: " + multResult);
    }
}
