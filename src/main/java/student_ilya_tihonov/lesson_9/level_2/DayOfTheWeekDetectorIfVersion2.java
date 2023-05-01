package student_ilya_tihonov.lesson_9.level_2;

public class DayOfTheWeekDetectorIfVersion2 implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        String dayName;
        switch (number) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Please input a valid number between 1 and 7";
                break;
        }
        return dayName;
    }

}
