package student_aleksandrs_lezhennikovs.lesson_4.level_1;

class WeekDay {

    String printWeekDay(int weekday) {
        String message;

        switch (weekday) {
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
            default:
                message = "Wrong number";
        }
        return message;
    }
}
