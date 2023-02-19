package student_aleksandrs_lezhennikovs.lesson_4.level_2;

import java.util.Scanner;

class MinOfTwoDemo {
    public static void main(String[] args) {
        MinOfTwo checkMin = new MinOfTwo();
        System.out.println("Please input two integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println(checkMin.checkMin(firstNumber, secondNumber));
    }
}
