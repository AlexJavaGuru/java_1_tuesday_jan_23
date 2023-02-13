package student_andrejs_cekalins.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int integerNumber = number_input.nextInt();
        if (integerNumber % 2 == 0) {
            System.out.print("Number is even");
        } else {
            System.out.print("Number is not even");
        }
    }
}

