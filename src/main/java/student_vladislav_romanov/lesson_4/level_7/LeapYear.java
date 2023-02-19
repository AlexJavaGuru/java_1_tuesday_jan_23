package student_vladislav_romanov.lesson_4.level_7;

class LeapYear {

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

}
