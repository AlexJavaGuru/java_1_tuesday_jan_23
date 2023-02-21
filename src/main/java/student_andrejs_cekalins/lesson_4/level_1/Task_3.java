package student_andrejs_cekalins.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int integerNumber = number.nextInt();
        if (integerNumber == 1) {
            System.out.print("Today is Monday");
        } else if (integerNumber == 2) {
            System.out.print("Today is Tuesday");
        } else if (integerNumber == 3) {
            System.out.print("Today is Wednesday");
        } else if (integerNumber == 4) {
            System.out.print("Today is Thursday");
        } else if (integerNumber == 5) {
            System.out.print("Today is Friday");
        } else if (integerNumber == 6) {
            System.out.print("Today is Saturday");
        } else if (integerNumber == 7) {
            System.out.print("Today is Sunday");
        } else {
            System.out.print("Such day not existing!");
        }
    }
}
