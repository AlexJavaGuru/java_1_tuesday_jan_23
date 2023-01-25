package student_andrejs_cekalins.lesson_2.level_3;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Scanner number_input = new Scanner(System.in);

        System.out.println("Test Data: ");
        System.out.print("Input a number: ");
        int number = number_input.nextInt();
        System.out.println();
        System.out.println("Expected Output : ");

        int result1 = number * 1;
        System.out.println(number + " * 1 = " +(result1));
        int result2 = number * 2;
        System.out.println(number + " * 2 = " +(result2));
        int result3 = number * 3;
        System.out.println(number + " * 3 = " +(result3));
        int result4 = number * 4;
        System.out.println(number + " * 4 = " +(result4));
        int result5 = number * 5;
        System.out.println(number + " * 5 = " +(result5));
        int result6 = number * 6;
        System.out.println(number + " * 6 = " +(result6));
        int result7 = number * 7;
        System.out.println(number + " * 7 = " +(result7));
        int result8 = number * 8;
        System.out.println(number + " * 8 = " +(result8));
        int result9 = number * 9;
        System.out.println(number + " * 9 = " +(result9));
        int result10 = number * 10;
        System.out.println(number + " * 10 = " +(result10));
    }
}
