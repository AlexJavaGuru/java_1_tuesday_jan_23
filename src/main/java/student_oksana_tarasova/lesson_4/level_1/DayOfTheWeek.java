package student_oksana_tarasova.lesson_4.level_1;

import java.util.Scanner;

class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 7");
        DayOfTheWeek.week(input.nextInt());
    }


    static void week(int number) {

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");


        }
    }
}
