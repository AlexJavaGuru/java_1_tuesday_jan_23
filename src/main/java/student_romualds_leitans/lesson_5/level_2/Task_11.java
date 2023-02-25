package student_romualds_leitans.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
      int [] array  = new int[3];
      Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Input a number for array cell " + i + ": " );
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Cell value " + i + ":" +array[i]);

        }
    }
}

