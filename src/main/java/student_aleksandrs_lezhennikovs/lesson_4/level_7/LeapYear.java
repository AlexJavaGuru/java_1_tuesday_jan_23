package student_aleksandrs_lezhennikovs.lesson_4.level_7;

class LeapYear {
    boolean isLeapYear(int checkYear) {
        int isCentury = checkYear % 100;

        if(isCentury == 0) {
            int isLeap = checkYear % 400;
            if (isLeap == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            int result = checkYear % 4;
            if (result == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
