package student_romualds_leitans.lesson_6.level_2;

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
        test.shouldReturnNotCorrectDay();


    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTweWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTweWeek), "Tuesday");

    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTweWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTweWeek), "Wednesday");

    }

    public void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTweWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTweWeek), "Thursday");

    }

    public void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTweWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTweWeek), "Friday");

    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTweWeeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTweWeeek), "Sunday");

    }

    public void shouldReturnSaturday() {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTwoWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTwoWeek), "Saturday");
    }

    public void shouldReturnNotCorrectDay() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTwoWeek = detector.findDayOfTheWeek(8);
        checkTestResult("Not correct day number".equals(dayOfTwoWeek), "Not correct day number");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }


}
