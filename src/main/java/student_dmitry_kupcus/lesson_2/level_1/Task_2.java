package student_dmitry_kupcus.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();
        double resultPlus = firstNumber + secondNumber;
        double resultMinus = firstNumber - secondNumber;
        double resultMultiply = firstNumber * secondNumber;
        double resultDivide = firstNumber / secondNumber;
        System.out.println(resultPlus);
        System.out.println(resultMinus);
        System.out.println(resultMultiply);
        System.out.println(resultDivide);
    }
}
