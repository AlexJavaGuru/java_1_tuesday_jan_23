package student_daniels_belejuns.lesson_4.level_7;

public class LeapYear {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }
}
