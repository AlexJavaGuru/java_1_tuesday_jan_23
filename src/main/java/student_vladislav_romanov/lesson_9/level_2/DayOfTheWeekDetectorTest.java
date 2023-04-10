package student_vladislav_romanov.lesson_9.level_2;

import student_vladislav_romanov.TestUtil;

class DayOfTheWeekDetectorTest extends TestUtil {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorIfVersionTestSucceed();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorIfVersionTestFailed();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorSwitchVersionTestSucceed();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorSwitchVersionTestFailed();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorStringArrayVersionTestSucceed();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorStringArrayVersionTestFailed();
        dayOfTheWeekDetectorTest.printStat();
    }

    public void DayOfTheWeekDetectorIfVersionTestSucceed() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeek = new DayOfTheWeekDetectorIfVersion();
        String expected = "Wednesday";
        String current = dayOfTheWeek.detectDayName(3);
        printResult(current.equals(expected), "DayOfTheWeekDetectorIfVersionTestSucceed");
    }

    public void DayOfTheWeekDetectorIfVersionTestFailed() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeek = new DayOfTheWeekDetectorIfVersion();
        String expected = "Monday";
        String current = dayOfTheWeek.detectDayName(3);
        printResult(!current.equals(expected), "DayOfTheWeekDetectorIfVersionTestFailed");
    }

    public void DayOfTheWeekDetectorSwitchVersionTestSucceed() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeek = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Wednesday";
        String current = dayOfTheWeek.detectDayName(3);
        printResult(current.equals(expected), "DayOfTheWeekDetectorSwitchVersionTestSucceed");
    }

    public void DayOfTheWeekDetectorSwitchVersionTestFailed() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeek = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Monday";
        String current = dayOfTheWeek.detectDayName(3);
        printResult(!current.equals(expected), "DayOfTheWeekDetectorSwitchVersionTestFailed");
    }

    public void DayOfTheWeekDetectorStringArrayVersionTestSucceed() {
        DayOfTheWeekDetectorStringArrayVersion dayOfTheWeek = new DayOfTheWeekDetectorStringArrayVersion();
        String expected = "Wednesday";
        String current = dayOfTheWeek.detectDayName(3);
        printResult(current.equals(expected), "DayOfTheWeekDetectorStringArrayVersionTestSucceed");
    }

    public void DayOfTheWeekDetectorStringArrayVersionTestFailed() {
        DayOfTheWeekDetectorStringArrayVersion dayOfTheWeek = new DayOfTheWeekDetectorStringArrayVersion();
        String expected = "Monday";
        String current = dayOfTheWeek.detectDayName(3);
        printResult(!current.equals(expected), "DayOfTheWeekDetectorStringArrayVersionTestFailed");
    }

}
