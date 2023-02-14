package student_romualds_leitans.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int userInput = scanner.nextInt();

        if (userInput >= 1){
            System.out.println( "Number " + userInput + " is positive. ");
        } else if (userInput <= 1){
            System.out.println( "Number " + userInput + " is negative. ");
        }
    }
}
