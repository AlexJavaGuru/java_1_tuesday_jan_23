package student_aleksandrs_lezhennikovs.lesson_4.level_3;

import java.util.Scanner;

class FindMaxDemo {
    public static void main(String[] args) {

        FindMax check = new FindMax();
        System.out.println("Please input three integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        System.out.println("Number " + check.checkNumber(firstNumber, secondNumber, thirdNumber) + " is the biggest");
    }
}
