package student_aleksandrs_lezhennikovs.lesson_9.level_2;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] weekDay = new String[8];
        weekDay[1] = "Monday";
        weekDay[2] = "Tuesday";
        weekDay[3] = "Wednesday";
        weekDay[4] = "Thursday";
        weekDay[5] = "Friday";
        weekDay[6] = "Saturday";
        weekDay[7] = "Sunday";
        weekDay[0] = "Please input a valid number between 1 and 7";

        if (number < 0 || number > 7) {
            return weekDay[0];
        }

        return weekDay[number];
    }
}
