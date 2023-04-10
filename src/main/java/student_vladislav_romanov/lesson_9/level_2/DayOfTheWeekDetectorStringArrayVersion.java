package student_vladislav_romanov.lesson_9.level_2;

class DayOfTheWeekDetectorStringArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] daysOfTheWeek = {"Please input a valid number between 1 and 7", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >= 1 && number <= 7) {
            return daysOfTheWeek[number];
        }
        return daysOfTheWeek[0];
    }

}
