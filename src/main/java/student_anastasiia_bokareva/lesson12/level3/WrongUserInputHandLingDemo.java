package student_anastasiia_bokareva.lesson12.level3;

import student_anastasiia_bokareva.lesson12.level2.AccessDeniedException;
import student_anastasiia_bokareva.lesson12.level2.Role;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandLingDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int number = scan.nextInt();
            if (number == (int) number) {
                System.out.println(number);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e){
            System.out.println("Enter integer, please...");
        }
    }
}
