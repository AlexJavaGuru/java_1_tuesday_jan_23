package student_ilya_tihonov.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] agrs){

        System.out.println("Please write two numbers");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);


    }

}
