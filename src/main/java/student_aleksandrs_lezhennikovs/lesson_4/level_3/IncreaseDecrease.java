package student_aleksandrs_lezhennikovs.lesson_4.level_3;

import java.util.Scanner;

class IncreaseDecrease {

    void checkNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three integer numbers:");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Decreasing");
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
