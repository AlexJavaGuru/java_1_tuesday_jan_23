package student_andrejs_cekalins.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);
        System.out.println("Please enter integer number: ");
        int integerNumber = number_input.nextInt();
        if (integerNumber > 0) {
            System.out.print("You number is: Positive");
        } else if (integerNumber < 0) {
            System.out.print("You number is: Negative");
        } else {
            System.out.print("You number is: 0 ");
        }
    }
}
