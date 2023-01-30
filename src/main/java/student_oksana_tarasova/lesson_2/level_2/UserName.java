package student_oksana_tarasova.lesson_2.level_2;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args){

      System.out.println("What is your name?");

      Scanner scanner = new Scanner(System.in);

      String userName = scanner.next();

      System.out.println("Hello, " + userName + "!");
    }
}
