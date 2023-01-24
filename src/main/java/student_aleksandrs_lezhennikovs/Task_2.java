package student_aleksandrs_lezhennikovs;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // fist number
        System.out.println("Input first number: ");
        double fistNumber = scanner.nextDouble();

        // second number
        System.out.println("Input second number: ");
        double secondNumber = scanner.nextDouble();

        //calculation
        double sumResult = fistNumber + secondNumber; //SUM
        double subtrResult = fistNumber - secondNumber; //subtraction
        double divResult = fistNumber / (double)secondNumber; //Dividing
        double multResult = fistNumber * secondNumber; //Multiplying

        System.out.println("SUM result is: " + sumResult);
        System.out.println("Subtraction result is: " + subtrResult);
        System.out.println("Dividing result is: " + divResult);
        System.out.println("Multiplying result is: " + multResult);
    }
}
