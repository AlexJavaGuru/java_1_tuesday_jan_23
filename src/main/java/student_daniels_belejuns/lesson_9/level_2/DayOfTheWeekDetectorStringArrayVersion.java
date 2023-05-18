package student_daniels_belejuns.lesson_9.level_2;

public abstract class DayOfTheWeekDetectorStringArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] detectDayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < detectDayName.length; i++) {
            if (i == number) {
                return detectDayName[i];
            }
        }
        return "Please input a valid number between 1 and 7";
    }
}

