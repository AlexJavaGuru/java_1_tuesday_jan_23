package student_natalja_semitseva.lesson_2.level_2;

import java.util.Scanner;

public class calculations {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of boys:");
        int firstNumber = scanner.nextInt();
        System.out.println("Number of girls:");
        int secondNumber = scanner.nextInt();
        System.out.println("Together:");
        int result = firstNumber+ secondNumber;
        System.out.println(result);

        System.out.println("minus:");
        int variableA = 11;
        int variableB = -2;
        int resultDi = variableA + variableB;
        System.out.println(resultDi);

        System.out.println("division");
        double resultDiv = variableA / (double)variableB;
        System.out.println(resultDiv);

        System.out.println("multiplication");
        int variableC = 15;
        int variableD = 2;
        int resultDiva = variableC * variableD;
        System.out.println(resultDiva);
    }
}







