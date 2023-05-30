package student_dmitry_kupcus.lesson_9.level_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] day = new String[8];
        day[0] = "Please write number between 1 and 7";
        day[1] = "Monday";
        day[2] = "Tuesday";
        day[3] = "Wednesday";
        day[4] = "Thursday";
        day[5] = "Friday";
        day[6] = "Saturday";
        day[7] = "Sunday";
        return day[number];
    }
}
