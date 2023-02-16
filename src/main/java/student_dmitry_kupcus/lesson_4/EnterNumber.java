package student_dmitry_kupcus.lesson_4;

import java.util.Scanner;

class EnterNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your number:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
            System.out.println("Your number is: " + number);
        } else if (number < 0){
            System.out.println("Number is negative");
            System.out.println("Your number is: " + number);
        } else {
            System.out.println("Your number is 0");
        }
    }
}
