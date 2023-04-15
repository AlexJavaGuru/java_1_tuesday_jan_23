package student_konstantin_kudrjavtsev.lesson_6.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {

        String resultFindDayOfTheWeek;
        switch (dayNumber) {
            case 1 -> resultFindDayOfTheWeek = "Monday";
            case 2 -> resultFindDayOfTheWeek = "Thuesday";
            case 3 -> resultFindDayOfTheWeek = "Wednesday";
            case 4 -> resultFindDayOfTheWeek = "Tuesday";
            case 5 -> resultFindDayOfTheWeek = "Friday";
            case 6 -> resultFindDayOfTheWeek = "Saturday";
            case 7 -> resultFindDayOfTheWeek = "Sunday";
            default -> resultFindDayOfTheWeek = "Not correct day number";
        }
            return resultFindDayOfTheWeek;
        }
}
