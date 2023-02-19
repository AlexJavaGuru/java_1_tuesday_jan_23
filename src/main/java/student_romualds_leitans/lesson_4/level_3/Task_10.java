package student_romualds_leitans.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Insert second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Insert third number: ");
        int thirdNumber = scanner.nextInt();

        if(firstNumber >= secondNumber && secondNumber >= thirdNumber){
            System.out.println( firstNumber + " largest number");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println( secondNumber + " largest number");
        } else if ( thirdNumber >= secondNumber && thirdNumber >= firstNumber){
            System.out.println( thirdNumber + " largest number");
        }
    }
}
