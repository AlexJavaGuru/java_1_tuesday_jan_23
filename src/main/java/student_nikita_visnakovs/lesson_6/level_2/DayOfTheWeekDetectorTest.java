package student_nikita_visnakovs.lesson_6.level_2;


public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest tester = new DayOfTheWeekDetectorTest();
        tester.testFindDayOfTheWeekMonday();
        tester.testFindDayOfTheWeekTuesday();
        tester.testFindDayOfTheWeekWednesday();
        tester.testFindDayOfTheWeekThursday();
        tester.testFindDayOfTheWeekFriday();
        tester.testFindDayOfTheWeekSaturday();
        tester.testFindDayOfTheWeekSunday();
        tester.testFindDayOfTheWeekNotCorrectNumber();

    }

    public void testFindDayOfTheWeekMonday() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 1;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Monday";
        checkResult(actualResult, expectedResult, "Find day of the week test Monday");
    }

    public void testFindDayOfTheWeekTuesday() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 2;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Tuesday";
        checkResult(actualResult, expectedResult, "Find day of the week test Tuesday");
    }

    public void testFindDayOfTheWeekWednesday() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 3;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Wednesday";
        checkResult(actualResult, expectedResult, "Find day of the week test Wednesday");
    }

    public void testFindDayOfTheWeekThursday() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 4;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Thursday";
        checkResult(actualResult, expectedResult, "Find day of the week test Thursday");
    }

    public void testFindDayOfTheWeekFriday() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 5;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Friday";
        checkResult(actualResult, expectedResult, "Find day of the week test Friday");
    }

    public void testFindDayOfTheWeekSaturday() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 6;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Saturday";
        checkResult(actualResult, expectedResult, "Find day of the week test Saturday");
    }

    public void testFindDayOfTheWeekSunday() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 7;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Sunday";
        checkResult(actualResult, expectedResult, "Find day of the week test Sunday");
    }

    public void testFindDayOfTheWeekNotCorrectNumber() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 8;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Not correct day number";
        checkResult(actualResult, expectedResult, "Find day of the week test NotCorrectNumber");
    }

    void checkResult(String actualResult, String expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has filed!");
        }
    }
}
