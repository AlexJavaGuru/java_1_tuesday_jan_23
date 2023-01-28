package student_julija_raudive.lesson_2.level_3;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {


        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number:");
        double numberOne = scanner.nextDouble();

        System.out.print("Second number:");
        double numberTwo = scanner.nextDouble();

        System.out.print("Third number:");
        double numberThree = scanner.nextDouble();

        double average = (numberOne + numberTwo + numberThree)/3;

        System.out.println("The average is " + average);


    }

}
