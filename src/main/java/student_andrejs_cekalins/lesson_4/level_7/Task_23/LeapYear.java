package student_andrejs_cekalins.lesson_4.level_7.Task_23;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
