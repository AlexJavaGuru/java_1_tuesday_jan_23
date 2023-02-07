package student_aleksandrs_lezhennikovs.lesson_4.level_2;

import java.util.Scanner;

class MinOfTwo {

    void checkMin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input first integer number:");
        int firstNumber = input.nextInt();
        System.out.println("Please input second integer number:");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Second number: " + secondNumber + " is smaller than first");
        } else if (firstNumber < secondNumber) {
            System.out.println("First number: " + firstNumber + " is smaller than second");
        } else {
            System.out.println("Numbers are equals!");
        }
    }
}
