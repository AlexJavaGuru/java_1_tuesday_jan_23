package student_nikita_visnakovs.lesson_9.level_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {
        if (number - 1>= 0 && number - 1 <= 6){
            return daysOfTheWeek[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
