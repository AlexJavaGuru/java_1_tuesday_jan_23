package student_aleksandrs_lezhennikovs.lesson_4.level_1;

import java.util.Scanner;

class DemoWeekDay {
    public static void main(String[] args) {
        System.out.println("Please input integer number from 1 till 7");

        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        WeekDay checkDay = new WeekDay();

        System.out.println("Weekday of " + day + " is " + checkDay.printWeekDay(day));
    }
}
