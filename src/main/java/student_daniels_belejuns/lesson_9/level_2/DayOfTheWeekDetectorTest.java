package student_daniels_belejuns.lesson_9.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.DayOfTheWeekDetectorIfVersion();
        test.DayOfTheWeekDetectorSwitchVersion();
    }

    public void DayOfTheWeekDetectorIfVersion() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion() {
            @Override
            public void printStat() {

            }
        };
        String expectedResult = "Tuesday";
        String realResult = dayOfTheWeekDetector.detectDayName(2);
        checkResult(expectedResult.equals(realResult), "DayOfTheWeekDetectorIfVersion test");
    }
    public void DayOfTheWeekDetectorSwitchVersion() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion() {
            @Override
            public void printStat() {

            }
        };
        String expectedResult = "Monday";
        String realResult = dayOfTheWeekDetector.detectDayName(2);
        checkResult(expectedResult.equals(realResult), "DayOfTheWeekDetectorSwitchVersion test");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}