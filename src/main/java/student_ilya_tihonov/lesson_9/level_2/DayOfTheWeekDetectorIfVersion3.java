package student_ilya_tihonov.lesson_9.level_2;

public class DayOfTheWeekDetectorIfVersion3 implements DayOfTheWeekDetector{

    private static final String[] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return DAYS_OF_WEEK[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
