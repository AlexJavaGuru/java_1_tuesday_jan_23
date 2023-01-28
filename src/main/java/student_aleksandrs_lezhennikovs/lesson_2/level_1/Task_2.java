package student_aleksandrs_lezhennikovs.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first real number:");
        double firstRealNumber = input.nextDouble();

        System.out.println("Input second real number:");
        double secondRealNumber = input.nextDouble();

        double resultOfSum = firstRealNumber + secondRealNumber;
        System.out.println("Result of Sum is: " + resultOfSum);

        double resultOfSubtracting = firstRealNumber - secondRealNumber;
        System.out.println("Result of Subtracting is: " + resultOfSubtracting);

        if (secondRealNumber == 0) {
            System.out.println("Not allowed divide by zero");
        } else {
            double resultOfDividing = firstRealNumber / secondRealNumber;
            System.out.println("Result of dividing is: " + resultOfDividing);
        }

        double resultOfMultiplicaton = firstRealNumber * secondRealNumber;
        System.out.println("Result of multiplication is: " + resultOfMultiplicaton);
    }
}
