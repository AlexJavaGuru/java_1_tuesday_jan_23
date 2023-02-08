package student_yaraslau_bardzinovich.lesson_2.homework.level_3_junior;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Test data ");
            System.out.print("Input Number:");
            int value = input.nextInt();
            System.out.println("Output: ");
            for (int a = 1; a <=10; a++)
                System.out.println(value + " * " + a + " = " + (value * a));
        }
    }

