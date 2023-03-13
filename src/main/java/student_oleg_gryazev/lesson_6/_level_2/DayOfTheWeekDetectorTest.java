package student_oleg_gryazev.lesson_6._level_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldNotReturnNotCorrectDayNumber();
    }

    void shouldReturnMonday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    void shouldReturnTuesday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    void shouldReturnWednesday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    void shouldReturnThursday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    void shouldReturnFriday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }

    void shouldReturnSaturday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    void shouldReturnSunday() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    void shouldNotReturnNotCorrectDayNumber() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();
        String dayOfTheWeek = day.findDayOfTheWeek(8);
        checkTestResult("WrongDayNumber".equals(dayOfTheWeek), "WrongDayNumber");
    }


}
