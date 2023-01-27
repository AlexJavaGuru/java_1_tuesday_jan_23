package student_aleksandrs_lezhennikovs.lesson_2.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input integer number: ");
        int initialNumber = input.nextInt();

        for (int counter = 1; counter <= 10; counter++) {
            int result = initialNumber * counter;
            System.out.println(initialNumber + " x " + counter + " = " + result);
        }
    }
}
