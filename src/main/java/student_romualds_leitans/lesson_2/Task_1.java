package student_romualds_leitans.lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Imput first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Imput second number: ");
        int secondNumber = in.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double)firstNumber / secondNumber));
    }
}
