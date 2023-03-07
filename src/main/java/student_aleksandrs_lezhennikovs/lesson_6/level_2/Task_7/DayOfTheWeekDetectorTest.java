package student_aleksandrs_lezhennikovs.lesson_6.level_2.Task_7;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        checkMonday();
        checkTuesday();
        checkWednesday();
        checkThursday();
        checkFriday();
        checkSaturday();
        checkSunday();
    }


    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
    static void checkMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 1;
        String expectedWeekDay = "Monday";
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        checkTestResult(expectedWeekDay.equals(dayOfTheWeek), "Monday test");
    }

    static void checkTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 2;
        String expectedWeekDay = "Tuesday";
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        checkTestResult(expectedWeekDay.equals(dayOfTheWeek), "Tuesday test");
    }

    static void checkWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 3;
        String expectedWeekDay = "Wednesday";
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        checkTestResult(expectedWeekDay.equals(dayOfTheWeek), "Wednesday test");
    }

    static void checkThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 4;
        String expectedWeekDay = "Thursday";
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        checkTestResult(expectedWeekDay.equals(dayOfTheWeek), "Thursday test");
    }

    static void checkFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 5;
        String expectedWeekDay = "Friday";
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        checkTestResult(expectedWeekDay.equals(dayOfTheWeek), "Friday test");
    }

    static void checkSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 6;
        String expectedWeekDay = "Saturday";
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        checkTestResult(expectedWeekDay.equals(dayOfTheWeek), "Saturday test");
    }

    static void checkSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 7;
        String expectedWeekDay = "Sunday";
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        checkTestResult(expectedWeekDay.equals(dayOfTheWeek), "Sunday test");
    }

}
