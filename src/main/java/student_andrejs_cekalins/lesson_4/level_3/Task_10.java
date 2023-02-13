package student_andrejs_cekalins.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);
        System.out.print("Please enter first integer number: ");
        int firstIntegerNumber = number_input.nextInt();
        System.out.print("Please enter second integer number: ");
        int secondIntegerNumber = number_input.nextInt();
        System.out.print("Please enter third integer number: ");
        int thirdIntegerNumber = number_input.nextInt();
        if (firstIntegerNumber > secondIntegerNumber && firstIntegerNumber > thirdIntegerNumber) {
            System.out.print("The first integer number are highest and = " + firstIntegerNumber);
        } else if (secondIntegerNumber > firstIntegerNumber && secondIntegerNumber > thirdIntegerNumber) {
            System.out.print("The second integer number are highest and = " + secondIntegerNumber);
        } else if (thirdIntegerNumber > firstIntegerNumber && thirdIntegerNumber > secondIntegerNumber) {
            System.out.print("The third integer number are highest and = " + thirdIntegerNumber);
        } else if (firstIntegerNumber == secondIntegerNumber) {
            System.out.print("First and second integer numbers are highest and are the same  = " + firstIntegerNumber);
        } else if (secondIntegerNumber == thirdIntegerNumber) {
            System.out.print("Second and third integer numbers are highest and are the same  = " + secondIntegerNumber);
        } else {
            System.out.print("You entered all equal numbers");
        }
    }
}
