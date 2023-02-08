package student_aleksandrs_lezhennikovs.lesson_4.level_2;

import java.util.Scanner;

class CheckDifference {

    void checkDiff() {
        System.out.println("Please input two integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
