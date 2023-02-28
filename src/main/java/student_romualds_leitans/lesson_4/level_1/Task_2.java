package student_romualds_leitans.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int userInput = scanner.nextInt();

        if (userInput > 0){
            System.out.println( "Number " + userInput + " is positive. ");
        } else if (userInput < 0){
            System.out.println( "Number " + userInput + " is negative. ");
        } else if (userInput == 0) {
            System.out.println("Number " + userInput + " is integer. ");
        }
    }
}

