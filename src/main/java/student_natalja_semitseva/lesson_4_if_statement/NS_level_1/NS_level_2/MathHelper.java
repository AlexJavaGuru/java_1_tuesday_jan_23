package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_level_2;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number: ");
        int value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.println(" even number ");

        } else {
            System.out.println(" odd number");

        }
    }
}




