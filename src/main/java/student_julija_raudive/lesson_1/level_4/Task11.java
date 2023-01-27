package student_julija_raudive.lesson_1.level_4;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {


        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number:");
        int numberOne = scanner.nextInt();

        System.out.print("Second number:");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;
        int  divide = numberOne / numberTwo;



        System.out.println("The sum is " + sum);
        System.out.println("The division is " + divide);


    }
}
