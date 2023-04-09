package student_oleg_gryazev.lesson_6._level_2;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Wrong day number!";
        };

    }
}
