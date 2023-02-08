package student_yaraslau_bardzinovich.lesson_2.homework.level_2_intern;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Username: ");
        String userInput = scanner.next();
        System.out.println("Hello," + userInput + "!");
    }
}
