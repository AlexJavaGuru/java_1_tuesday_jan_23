package student_andrejs_cekalins.lesson_4.level_7.Task_23;


class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYear();
    }

    public void leapYear() {
        int year = 500;
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Leap year test = OK");
        } else {
            System.out.println("Leap year test = Fail");
        }
    }
}
