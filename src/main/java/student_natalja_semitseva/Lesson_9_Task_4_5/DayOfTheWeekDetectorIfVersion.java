package student_natalja_semitseva.Lesson_9_Task_4_5;

public class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {


    private int number;

    @Override
    public String detectDayName(int number) {


        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }

    }
    @Override
    public String detectDayName1(int number) {
        String[] daysOfTheWeek = new String[8];
        daysOfTheWeek[1] = "Monday";
        daysOfTheWeek[2] = "Tuesday";
        daysOfTheWeek[3] = "wednesday";
        daysOfTheWeek[4] = "Thursday";
        daysOfTheWeek[5] = "Friday";
        daysOfTheWeek[6] = "Saturday";
        daysOfTheWeek[7] = "Sunday";
        daysOfTheWeek[0] = "Please input a valid number";

        if (number < 0 && number > 7) {
            return daysOfTheWeek[0];
        }
        return daysOfTheWeek[number];

    }



        @Override
    public int detectDayName2(int number) {


        int inDay = 1;
        String day;
        switch (inDay) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                break;
            default:
                day = "Invalid entry";
                break;
        }


        return inDay;
    }

}