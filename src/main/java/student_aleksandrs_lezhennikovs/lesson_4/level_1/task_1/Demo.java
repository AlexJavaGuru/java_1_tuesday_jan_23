package student_aleksandrs_lezhennikovs.lesson_4.level_1.task_1;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        PositivCheck myCheck = new PositivCheck();
        Scanner input = new Scanner(System.in);

        System.out.println("Input Integer number please: ");
        int number = input.nextInt();
        if (myCheck.isPositiv(number)) {
            System.out.println("Your number is Positive");
        } else {
            System.out.println("Yor number is Negative");
        }
    }
}
