package student_natalija_rasponomarjova.lesson_6.level_2;

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
        test.shouldReturnNotCorrectDay();

    }

    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

    public void shouldReturnMonday() {
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    public void shouldReturnTuesday() {
        String dayOfWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfWeek), "Tuesday");
    }

    public void shouldReturnWednesday() {
        String dayOfWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfWeek), "Wednesday");
    }

    public void shouldReturnThursday() {
        String dayOfWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfWeek), "Thursday");
    }

    public void shouldReturnFriday() {
        String dayOfWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfWeek), "Friday");
    }

    public void shouldReturnSaturday() {
        String dayOfWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfWeek), "Saturday");
    }

    public void shouldReturnSunday() {
        String dayOfWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfWeek), "Sunday");
    }

    public void shouldReturnNotCorrectDay() {
        String dayOfWeek = detector.findDayOfTheWeek(10);
        checkTestResult("Not correct day number".equals(dayOfWeek), "Not correct day number");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = TEST OK");
        } else {
            System.out.println(testName + " = TEST FAILED");
        }
    }
}
