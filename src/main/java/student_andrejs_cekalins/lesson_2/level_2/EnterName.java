package student_andrejs_cekalins.lesson_2.level_2;

import java.util.Scanner;

public class EnterName {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String firstName;
        System.out.print("Enter your first name: ");
       firstName = user_input.next();


        System.out.print("Hello: " +firstName);

    }
}
