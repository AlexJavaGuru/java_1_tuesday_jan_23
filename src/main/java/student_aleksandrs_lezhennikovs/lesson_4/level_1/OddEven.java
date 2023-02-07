package student_aleksandrs_lezhennikovs.lesson_4.level_1;

import java.util.Scanner;

class OddEven {

    void isOdd() {
        System.out.println("Input integer number please:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int check = number % 2;
        if (check == 0) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("You number is ODD");
        }
    }
}
