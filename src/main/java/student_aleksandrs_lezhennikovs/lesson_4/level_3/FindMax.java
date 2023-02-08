package student_aleksandrs_lezhennikovs.lesson_4.level_3;

import java.util.Scanner;

class FindMax {
    void checkNumber() {
        System.out.println("Please input three integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        // A >= B and A >= C
        // B >= A and B >= C
        // C
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Number " + firstNumber + " is the biggest");

        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Number " + secondNumber + " is the biggest");

        } else {
            System.out.println("Number " + thirdNumber + " is the biggest");
        }
    }
}
