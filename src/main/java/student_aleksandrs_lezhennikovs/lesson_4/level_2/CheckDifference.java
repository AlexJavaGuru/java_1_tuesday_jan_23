package student_aleksandrs_lezhennikovs.lesson_4.level_2;

import java.util.Scanner;

class CheckDifference {

    void checkDiff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input first integer number:");
        int firstNumber = input.nextInt();
        System.out.println("Please input second integer number:");
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals!");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
