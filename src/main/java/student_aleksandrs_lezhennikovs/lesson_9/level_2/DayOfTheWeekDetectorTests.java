package student_aleksandrs_lezhennikovs.lesson_9.level_2;

public class DayOfTheWeekDetectorTests {
    public static void main(String[] args) {
        checkMondayCaseVersion();
        checkTuesdayCaseVersion();
        checkWednesdayCaseVersion();
        checkThursdayCaseVersion();
        checkFridayCaseVersion();
        checkSaturdayCaseVersion();
        checkSundayCaseVersion();
        checkWrongDayCaseVersion();
        checkMondayIfVersion();
        checkTuesdayIfVersion();
        checkWednesdayIfVersion();
        checkThursdayIfVersion();
        checkFridayIfVersion();
        checkSaturdayIfVersion();
        checkSundayIfVersion();
        checkWrongDayIfVersion();
        checkMondayArrayVersion();
        checkTuesdayArrayVersion();
        checkWednesdayArrayVersion();
        checkThursdayArrayVersion();
        checkFridayArrayVersion();
        checkSaturdayArrayVersion();
        checkSundayArrayVersion();
        checkWrongDayArrayVersion();
    }

    private static void checkMondayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Monday";
        String calculatedResult = caseVersion.detectDayName(1);
        check("Monday case version", expectedResult, calculatedResult);
    }

    private static void checkTuesdayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Tuesday";
        String calculatedResult = caseVersion.detectDayName(2);
        check("Tuesday case version", expectedResult, calculatedResult);
    }

    private static void checkWednesdayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Wednesday";
        String calculatedResult = caseVersion.detectDayName(3);
        check("Wednesday case version", expectedResult, calculatedResult);
    }

    private static void checkThursdayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Thursday";
        String calculatedResult = caseVersion.detectDayName(4);
        check("Thursday case version", expectedResult, calculatedResult);
    }

    private static void checkFridayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Friday";
        String calculatedResult = caseVersion.detectDayName(5);
        check("Friday case version", expectedResult, calculatedResult);
    }

    private static void checkSaturdayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Saturday";
        String calculatedResult = caseVersion.detectDayName(6);
        check("Saturday case version", expectedResult, calculatedResult);
    }

    private static void checkSundayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Sunday";
        String calculatedResult = caseVersion.detectDayName(7);
        check("Sunday case version", expectedResult, calculatedResult);
    }

    private static void checkWrongDayCaseVersion() {
        DayOfTheWeekDetectorCaseVersion caseVersion = new DayOfTheWeekDetectorCaseVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String calculatedResult = caseVersion.detectDayName(0);
        check("WrongDay case version", expectedResult, calculatedResult);
    }
    private static void check(String actionName, String expect, String actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }

    private static void checkMondayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Monday";
        String calculatedResult = ifVersion.detectDayName(1);
        check("Monday if version", expectedResult, calculatedResult);
    }

    private static void checkTuesdayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Tuesday";
        String calculatedResult = ifVersion.detectDayName(2);
        check("Tuesday If version", expectedResult, calculatedResult);
    }

    private static void checkWednesdayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Wednesday";
        String calculatedResult = ifVersion.detectDayName(3);
        check("Wednesday If version", expectedResult, calculatedResult);
    }

    private static void checkThursdayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Thursday";
        String calculatedResult = ifVersion.detectDayName(4);
        check("Thursday If version", expectedResult, calculatedResult);
    }

    private static void checkFridayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Friday";
        String calculatedResult = ifVersion.detectDayName(5);
        check("Friday If version", expectedResult, calculatedResult);
    }

    private static void checkSaturdayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Saturday";
        String calculatedResult = ifVersion.detectDayName(6);
        check("Saturday If version", expectedResult, calculatedResult);
    }

    private static void checkSundayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Sunday";
        String calculatedResult = ifVersion.detectDayName(7);
        check("Sunday If version", expectedResult, calculatedResult);
    }

    private static void checkWrongDayIfVersion() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String calculatedResult = ifVersion.detectDayName(0);
        check("WrongDay If version", expectedResult, calculatedResult);
    }

    private static void checkMondayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Monday";
        String calculatedResult = arrayVersion.detectDayName(1);
        check("Monday Array version", expectedResult, calculatedResult);
    }

    private static void checkTuesdayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Tuesday";
        String calculatedResult = arrayVersion.detectDayName(2);
        check("Tuesday Array version", expectedResult, calculatedResult);
    }

    private static void checkWednesdayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Wednesday";
        String calculatedResult = arrayVersion.detectDayName(3);
        check("Wednesday Array version", expectedResult, calculatedResult);
    }

    private static void checkThursdayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Thursday";
        String calculatedResult = arrayVersion.detectDayName(4);
        check("Thursday Array version", expectedResult, calculatedResult);
    }

    private static void checkFridayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Friday";
        String calculatedResult = arrayVersion.detectDayName(5);
        check("Friday Array version", expectedResult, calculatedResult);
    }

    private static void checkSaturdayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Saturday";
        String calculatedResult = arrayVersion.detectDayName(6);
        check("Saturday Array version", expectedResult, calculatedResult);
    }

    private static void checkSundayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Sunday";
        String calculatedResult = arrayVersion.detectDayName(7);
        check("Sunday Array version", expectedResult, calculatedResult);
    }

    private static void checkWrongDayArrayVersion() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String calculatedResult = arrayVersion.detectDayName(0);
        check("WrongDay Array version", expectedResult, calculatedResult);
    }
}
