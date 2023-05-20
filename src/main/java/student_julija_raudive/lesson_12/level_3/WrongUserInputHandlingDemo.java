package student_julija_raudive.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

     public static void main(String[] args) {

         int number;
         boolean error = true;
         do {
             System.out.println("Enter the number: ");
             try {
                 Scanner scanner = new Scanner(System.in);
                 number = scanner.nextInt();
                 error = false;
             } catch (InputMismatchException e) {
                 System.out.println("Wrong input format. Enter the number:");
             }
         }while (error);





     }
}
