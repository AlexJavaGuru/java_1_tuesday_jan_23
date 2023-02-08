package student_aleksandrs_lezhennikovs.lesson_4.level_3;

import java.util.Scanner;

class CheckThreeNumbers {
    void checkNumber() {
        System.out.println("Please input three integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All three numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All three numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
