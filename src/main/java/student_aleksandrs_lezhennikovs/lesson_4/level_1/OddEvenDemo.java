package student_aleksandrs_lezhennikovs.lesson_4.level_1;

import java.util.Scanner;

class OddEvenDemo {
    public static void main(String[] args) {

        OddEven checkNumber = new OddEven();
        Scanner input = new Scanner(System.in);

        System.out.println("Input integer number please:");
        int number = input.nextInt();
        if (checkNumber.isOdd(number)) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("You number is ODD");
        }
    }
}
