package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_7_Super_task_2;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if (!isDividedBy4(year)) {
            return false;

        }
        if (!isDividedBy100(year)) {
            return true;

        }
        return isDividedBy400(year);
    }

    private boolean isDividedBy4(int year) {
        return year % 4 == 0;
    }

    private boolean isDividedBy100(int year) {
        return year % 100 == 0;
    }

    private boolean isDividedBy400(int year) {
        return year % 400 == 0;
    }

}
