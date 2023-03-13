package student_oksana_tarasova.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.notDayWeek();
    }

    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

    public void shouldReturnMonday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    public void shouldReturnTuesday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    public void shouldReturnWednesday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public void shouldReturnThursday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    public void shouldReturnFriday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }

    public void shouldReturnSaturday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public void shouldReturnSunday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void notDayWeek() {
        String dayOfTheWeek = detector.findDayOfTheWeek(8);
        checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not day week");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
