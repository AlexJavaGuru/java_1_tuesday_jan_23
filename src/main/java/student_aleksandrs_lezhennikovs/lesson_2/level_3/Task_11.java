package student_aleksandrs_lezhennikovs.lesson_2.level_3;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input first integer number:");
        int firstNumber = input.nextInt();

        System.out.println("Please input second integer number:");
        int secondNumber = input.nextInt();

        System.out.println("Please input third integer number:");
        int thirdNumber = input.nextInt();

        double result = (firstNumber + secondNumber + (double)thirdNumber) / 3;

        System.out.println("Result of arithmetical mean value is: " + result);
    }
}
