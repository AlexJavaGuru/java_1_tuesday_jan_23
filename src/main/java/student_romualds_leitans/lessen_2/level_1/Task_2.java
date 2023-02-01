package student_romualds_leitans.lessen_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Imput first number: ");
        Double firstNumber = scanner.nextDouble();

        System.out.print("Imput second number: ");
        Double secondNumber = scanner.nextDouble();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double)firstNumber / secondNumber));
    }

}
