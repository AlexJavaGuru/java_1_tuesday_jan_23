package student_andrejs_cekalins.lesson_2.level_5;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Scanner number_input = new Scanner(System.in);

        String firstName;
        System.out.print("Enter your first name: ");
        firstName = user_input.next();
        String lastName;
        System.out.print("Enter your first name: ");
        lastName = user_input.next();
        System.out.print("Input your age: ");
        int number = number_input.nextInt();


        System.out.print("You are: "+firstName);
        System.out.print(" " +lastName);
        System.out.print(" and "+number);
        System.out.print(" old ");
    }
}
