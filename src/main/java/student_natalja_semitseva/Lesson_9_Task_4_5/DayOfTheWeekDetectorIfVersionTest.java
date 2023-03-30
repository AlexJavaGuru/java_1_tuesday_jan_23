package student_natalja_semitseva.Lesson_9_Task_4_5;


class DayOfTheWeekDetectorIfVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTest dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersionTest();
        dayOfTheWeekDetectorIfVersion.testDetectDayName();
        dayOfTheWeekDetectorIfVersion.testDetectDayNameFailed();
        dayOfTheWeekDetectorIfVersion.testDetectDayName1();
        dayOfTheWeekDetectorIfVersion.testDetectDayNameFailed1();
        dayOfTheWeekDetectorIfVersion.testDetectDayName2();
        dayOfTheWeekDetectorIfVersion.testDetectDayName2Failed();

    }


    public void testDetectDayName() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeek = new DayOfTheWeekDetectorIfVersion();
        String expected = "Monday";
        String result = dayOfTheWeek.detectDayName(1);
        checkResult(result.equals(expected), "Test DetectDayName");
    }

    public void testDetectDayNameFailed() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeek = new DayOfTheWeekDetectorIfVersion();
        String expected = "Wednesday";
        String result = dayOfTheWeek.detectDayName(5);
        checkResult(!result.equals(expected), "Test DetectDayNameFailed");
    }


    public void checkResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " test OK");

        } else {
            System.out.println(testName + " test FAILED");
        }
    }

    public void testDetectDayName1() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeek = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Monday";
        String result = dayOfTheWeek.detectDayName1(1);
        checkResult(result.equals(expected), "Test DetectDayName1");
    }

    public void testDetectDayNameFailed1() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeek = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Monday";
        String result = dayOfTheWeek.detectDayName1(5);
        checkResult(!result.equals(expected), "Test DetectDayNameFailed1");
    }

    public void testDetectDayName2() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeek = new DayOfTheWeekDetectorIfVersion();
        String expected = "Tuesday";
        String result = dayOfTheWeek.detectDayName(2);
        checkResult(result.equals(expected), "Test testDetectDayName2");

    }

    public void testDetectDayName2Failed() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeek = new DayOfTheWeekDetectorIfVersion();
        String expected = "Tuesday";
        String result = dayOfTheWeek.detectDayName(1);
        checkResult(!result.equals(expected), "Test testDetectDayName2Failed");


    }


}
