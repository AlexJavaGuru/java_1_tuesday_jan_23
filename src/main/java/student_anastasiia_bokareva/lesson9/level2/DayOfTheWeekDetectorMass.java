package student_anastasiia_bokareva.lesson9.level2;

public class DayOfTheWeekDetectorMass implements DayOfTheWeekDetector {

    public String detectDayName(int number) {
        String[] dayOfTheWeek = new String[8];
        dayOfTheWeek[0] = "Please input a valid number between 1 and 7";
        dayOfTheWeek[1] = "Monday";
        dayOfTheWeek[2] = "Tuesday";
        dayOfTheWeek[3] = "Wednesday";
        dayOfTheWeek[4] = "Thursday";
        dayOfTheWeek[5] = "Friday";
        dayOfTheWeek[6] = "Saturday";
        dayOfTheWeek[7] = "Sunday";

        if ((number < 1) || (number > 7)) {
            return dayOfTheWeek[0];
        } else {
            return dayOfTheWeek[number];
        }
    }
}
