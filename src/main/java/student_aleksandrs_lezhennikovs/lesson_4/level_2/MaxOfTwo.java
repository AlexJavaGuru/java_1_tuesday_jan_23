package student_aleksandrs_lezhennikovs.lesson_4.level_2;

import java.util.Scanner;

class MaxOfTwo {

    void checkMax() {
        System.out.println("Please input two integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number: " + firstNumber + " is bigger than second");
        } else if (firstNumber < secondNumber) {
            System.out.println("Second number: " + secondNumber + " is bigger than first");
        } else {
            System.out.println("Numbers are equals!");
        }
    }
}
