package student_andrejs_cekalins.lesson_2.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result1 = firstNumber + secondNumber;
        int result2 = firstNumber - secondNumber;
        int result3 = firstNumber * secondNumber;
        double result4 = firstNumber / (double)secondNumber;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}


