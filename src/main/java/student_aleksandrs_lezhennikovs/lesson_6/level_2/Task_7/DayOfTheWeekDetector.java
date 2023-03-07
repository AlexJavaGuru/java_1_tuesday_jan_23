package student_aleksandrs_lezhennikovs.lesson_6.level_2.Task_7;

import java.util.Scanner;

public class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {

        String weekDay;
        switch (dayNumber) {
            case 1 -> weekDay = "Monday";
            case 2 -> weekDay = "Tuesday";
            case 3 -> weekDay = "Wednesday";
            case 4 -> weekDay = "Thursday";
            case 5 -> weekDay = "Friday";
            case 6 -> weekDay = "Saturday";
            case 7 -> weekDay = "Sunday";
            default -> weekDay = "Not correct day number";
        }
        return weekDay;
    }
}
