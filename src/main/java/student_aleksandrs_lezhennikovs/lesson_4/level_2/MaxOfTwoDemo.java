package student_aleksandrs_lezhennikovs.lesson_4.level_2;

import java.util.Scanner;

class MaxOfTwoDemo {
    public static void main(String[] args) {
        MaxOfTwo checkMax = new MaxOfTwo();
        System.out.println("Please input two integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println(checkMax.checkMax(firstNumber, secondNumber));
    }
}
