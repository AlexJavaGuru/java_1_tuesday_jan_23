package student_konstantin_kudrjavtsev.lesson_1;

import java.util.Scanner;

class Qtask_1 {
    public static void main(String[] args) {
        System.out.println("Task_1");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}