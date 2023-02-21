package student_andrejs_cekalins.lesson_4.level_7.Task_23;


class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.leapYear();
        test.notLeapYear();
        test.leapYearCentury();
        test.notLeapYearCentury();
    }

    public void leapYear() {
        int year = 2020;
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);
        checkResult(result, "Leap year test");
    }

    public void notLeapYear() {
        int year = 2015;
        LeapYear leapYear = new LeapYear();
        boolean result = !leapYear.isLeapYear(year);
        checkResult(result, "Not leap year test");
    }

    public void leapYearCentury() {
        int year = 2000;
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);
        checkResult(result, "Leap year century test");
    }

    public void notLeapYearCentury() {
        int year = 2100;
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);
        checkResult(result, "Not leap year century test");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
