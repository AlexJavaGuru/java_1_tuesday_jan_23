package student_aleksandrs_lezhennikovs.lesson_4.level_3;

import java.util.Scanner;

class FindMax {
    void checkNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three integer numbers:");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        // A >= B and A >= C
        // B >= A and B >= C
        // C
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Number " + firstNumber + " is biggest");

        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Number " + secondNumber + " is biggest");

        } else {
            System.out.println("Number " + thirdNumber + " are the biggest");
        }
    }
}
