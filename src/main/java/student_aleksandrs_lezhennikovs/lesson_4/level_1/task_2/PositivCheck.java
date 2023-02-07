package student_aleksandrs_lezhennikovs.lesson_4.level_1.task_2;

import java.util.Scanner;

class PositivCheck {

    void isPositiv() {

        Scanner input = new Scanner(System.in);
        System.out.println("Input Integer number please: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Your number is Positive");
        } else if (number < 0){
            System.out.println("Yor number is Negative");
        } else {
            System.out.println("Your number is equal to zero");
        }

    }
}
