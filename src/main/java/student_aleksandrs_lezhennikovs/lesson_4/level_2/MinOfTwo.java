package student_aleksandrs_lezhennikovs.lesson_4.level_2;

import java.util.Scanner;

class MinOfTwo {

    void checkMin() {
        System.out.println("Please input two integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Second number: " + secondNumber + " is smaller than first");
        } else if (firstNumber < secondNumber) {
            System.out.println("First number: " + firstNumber + " is smaller than second");
        } else {
            System.out.println("Numbers are equal!");
        }
    }
}
