package student_andrejs_cekalins.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);
        System.out.print("Please enter first integer number: ");
        int firstIntegerNumber = number_input.nextInt();
        System.out.print("Please enter second integer number: ");
        int secondIntegerNumber = number_input.nextInt();
        if (firstIntegerNumber > secondIntegerNumber) {
            System.out.print("First number is greater than second number");
        } else if (firstIntegerNumber < secondIntegerNumber) {
            System.out.print("First number is less than second number");
        } else {
            System.out.print("Numbers are equals");
        }
    }
}
