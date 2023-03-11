package student_daniels_belejuns.lesson_4.level_3;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        double firstNumber = scan.nextInt();
        System.out.println("Second number: ");
        double secondNumber = scan.nextInt();
        System.out.println("Third number: ");
        double thirdNumber = scan.nextInt();

        if (firstNumber < secondNumber && secondNumber > thirdNumber) {
            System.out.println("increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }


    }
}
