package student_aleksandrs_lezhennikovs.lesson_4.level_7;

class LeapYear {
    boolean isLeapYear(int checkYear) {
        boolean result;

        if(checkYear % 100 == 0) {
            result = (checkYear % 400 == 0);
        } else {
            result = (checkYear % 4 == 0);
        }
        return result;
    }
}
