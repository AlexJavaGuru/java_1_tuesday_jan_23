package student_andrejs_cekalins.lesson_9.level_2;

import student_andrejs_cekalins.lesson_9.level_2.DayOfTheWeekDetector;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

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
