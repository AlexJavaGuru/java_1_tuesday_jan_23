package student_dmitry_kupcus.lesson_2.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
