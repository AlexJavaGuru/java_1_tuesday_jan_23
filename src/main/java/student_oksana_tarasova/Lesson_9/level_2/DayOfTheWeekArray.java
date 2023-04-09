package student_oksana_tarasova.Lesson_9.level_2;

class DayOfTheWeekArray implements DayOfTheWeekDetector {

    String[] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {
        for (int i = 0; i < daysWeek.length + 1; i++) {
            if (number > daysWeek.length) {
                return "Please input a valid number between 1 and 7";
            }
        }
        return daysWeek[number - 1];
    }
}
