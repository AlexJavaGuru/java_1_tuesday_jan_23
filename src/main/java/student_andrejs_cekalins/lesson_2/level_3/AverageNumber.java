package student_andrejs_cekalins.lesson_2.level_3;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);

        System.out.println("Test Data: ");
        System.out.print("Enter first integer number: ");
        int firstIntegerNumber = number_input.nextInt();
        System.out.print("Enter second integer number: ");
        int secondIntegerNumber = number_input.nextInt();
        System.out.print("Enter third integer number: ");
        int thirdIntegerNumber = number_input.nextInt();

        double avg =((double)firstIntegerNumber+secondIntegerNumber+thirdIntegerNumber)/3;
        System.out.println();
        System.out.println("Expected Output : ");
        System.out.println("Average is : "+ avg);


    }
}
