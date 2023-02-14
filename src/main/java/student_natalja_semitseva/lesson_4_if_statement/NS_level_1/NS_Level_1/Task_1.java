package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Number ");


        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("positive");

        } else if (number < 0) {
            System.out.println("negative");


        }
    }
}
