package student_vladislav_romanov.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        leapYearTest();
        nonLeapYearTest();
        leapCenturyTest();
        nonLeapCenturyTest();
    }

    static void leapYearTest() {
        LeapYear year = new LeapYear();

        boolean expected = true;

        boolean actual = year.isLeapYear(2004);

        if (expected == actual) {
            System.out.println("Leap year test PASSED");
        } else {
            System.out.println("Leap year test FAILED");
        }
    }

    static void nonLeapYearTest() {
        LeapYear year = new LeapYear();

        boolean expected = false;

        boolean actual = year.isLeapYear(2001);

        if (expected == actual) {
            System.out.println("Non-leap year test PASSED");
        } else {
            System.out.println("Non-leap year test FAILED");
        }
    }

    static void leapCenturyTest() {
        LeapYear year = new LeapYear();

        boolean expected = true;

        boolean actual = year.isLeapYear(2000);

        if (expected == actual) {
            System.out.println("Leap century test PASSED");
        } else {
            System.out.println("Leap century test FAILED");
        }
    }

    static void nonLeapCenturyTest() {
        LeapYear year = new LeapYear();

        boolean expected = false;

        boolean actual = year.isLeapYear(1900);

        if (expected == actual) {
            System.out.println("Non-leap century test PASSED");
        } else {
            System.out.println("Non-leap century test FAILED");
        }
    }

}
