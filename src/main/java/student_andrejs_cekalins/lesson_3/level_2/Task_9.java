package student_andrejs_cekalins.lesson_3.level_2;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner userName_input = new Scanner(System.in);

        String userName;
        System.out.print("Enter your user name: ");
        userName = userName_input.next();

       System.out.println("Hello " + userName +"!");


    }
}
