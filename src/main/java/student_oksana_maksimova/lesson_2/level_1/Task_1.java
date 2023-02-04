package student_oksana_maksimova.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();


            System.out.println(firstNumber + "+" + secondNumber+"="+(firstNumber + secondNumber));
            System.out.println(firstNumber + "-" + secondNumber+"="+(firstNumber - secondNumber));
            System.out.println(firstNumber + "/" + secondNumber+"="+(firstNumber / secondNumber));
            System.out.println(firstNumber + "*" + secondNumber+"="+(firstNumber * secondNumber));
    }
}
