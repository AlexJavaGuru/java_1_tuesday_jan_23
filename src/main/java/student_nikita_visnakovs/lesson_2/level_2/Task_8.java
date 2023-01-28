package student_nikita_visnakovs.lesson_2.level_2;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("What is your name ?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
