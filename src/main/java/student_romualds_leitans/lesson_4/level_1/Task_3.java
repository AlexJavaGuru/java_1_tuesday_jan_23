package student_romualds_leitans.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number from 1 to 7 : ");
        int userInput = scanner.nextInt();

        if (userInput == 1){
            System.out.println("Monday");}
        else if (userInput == 2) {
            System.out.println("Tuesday");}
        else if (userInput == 3) {
            System.out.println("Wednesday");}
        else if (userInput == 4) {
            System.out.println("Thursday");}
        else if (userInput == 5) {
            System.out.println("Friday");}
        else if (userInput == 6) {
            System.out.println("Saturday");}
        else if (userInput == 7) {
            System.out.println("Sunday");}
        }
}
