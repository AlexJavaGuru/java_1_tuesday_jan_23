package student_nikita_visnakovs.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        System.out.println("Enter integer from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        System.out.println("1 * " + userNum + " = " +   userNum);
        System.out.println("2 * " + userNum + " = " + 2 * userNum);
        System.out.println("3 * " + userNum + " = " + 3 * userNum);
        System.out.println("4 * " + userNum + " = " + 4 * userNum);
        System.out.println("5 * " + userNum + " = " + 5 * userNum);
        System.out.println("6 * " + userNum + " = " + 6 * userNum);
        System.out.println("7 * " + userNum + " = " + 7 * userNum);
        System.out.println("8 * " + userNum + " = " + 8 * userNum);
        System.out.println("9 * " + userNum + " = " + 9 * userNum);
        System.out.println("10 * " + userNum + " = " + 10 * userNum);

    }
}
