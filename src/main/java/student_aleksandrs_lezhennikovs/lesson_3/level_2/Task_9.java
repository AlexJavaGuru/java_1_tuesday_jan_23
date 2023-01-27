package student_aleksandrs_lezhennikovs.lesson_3.level_2;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {

        System.out.println("Enter your name please");
        Scanner input = new Scanner(System.in);

        String yourName = input.nextLine();

        System.out.println("Hello " + yourName + "!");

    }
}
