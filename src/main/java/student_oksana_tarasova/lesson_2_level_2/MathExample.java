package student_oksana_tarasova.lesson_2_level_2;

import java.util.Scanner;

public class MathExample {
    public static void main (String[] arg){

        Scanner scanner = new Scanner (System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int resultPlus = firstNumber + secondNumber;
        int resultMinus = firstNumber - secondNumber;
        int resultMultiply = firstNumber * secondNumber;
        int resultDivide = firstNumber / secondNumber;

        System.out.println(resultPlus);
        System.out.println(resultMinus);
        System.out.println(resultMultiply);
        System.out.println(resultDivide);
    }
}
