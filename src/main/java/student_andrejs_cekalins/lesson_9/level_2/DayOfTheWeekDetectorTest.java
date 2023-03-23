package student_andrejs_cekalins.lesson_9.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.DayOfTheWeekDetectorIfVersion();
        test.DayOfTheWeekDetectorSwitchVersion();
        test.DayOfTheWeekDetectorArrayVersion();
    }

    public void DayOfTheWeekDetectorIfVersion() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Tuesday";
        String realResult = dayOfTheWeekDetector.detectDayName(2);
        checkResult(expectedResult.equals(realResult), "DayOfTheWeekDetectorIfVersion test");
    }
    public void DayOfTheWeekDetectorSwitchVersion() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Tuesday";
        String realResult = dayOfTheWeekDetector.detectDayName(2);
        checkResult(expectedResult.equals(realResult), "DayOfTheWeekDetectorSwitchVersion test");
    }
    public void DayOfTheWeekDetectorArrayVersion() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Tuesday";
        String realResult = dayOfTheWeekDetector.detectDayName(1);
        checkResult(expectedResult.equals(realResult), "DayOfTheWeekDetectorArrayVersion test");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
