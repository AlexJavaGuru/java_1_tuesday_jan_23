package student_oksana_tarasova.Lesson_9.level_2;

class DayOfTheWeekTest {
    public static void main(String[] args) {
        DayOfTheWeekTest test = new DayOfTheWeekTest();
        test.DayOfTheWeekArrayTest();
        test.DayOfTheWeekArrayTest1();
        test.DayOfTheWeekSwitchTest();
        test.DayOfTheWeekSwitchTest1();
        test.DayOfTheWeekDetectorIfVersionTest();
        test.DayOfTheWeekDetectorIfVersionTest1();
    }

    public void DayOfTheWeekArrayTest() {
        DayOfTheWeekDetector day = new DayOfTheWeekArray();
        String expectedResult = "Friday";
        String realResult = day.detectDayName(5);
        check(expectedResult.equals(realResult), "dayArrayTest");
    }

    public void DayOfTheWeekArrayTest1() {
        DayOfTheWeekDetector day = new DayOfTheWeekArray();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = day.detectDayName(9);
        check(expectedResult.equals(realResult), "notDayArrayTest");
    }

    public void DayOfTheWeekSwitchTest() {
        DayOfTheWeekDetector day = new DayOfTheWeekSwitch();
        String expectedResult = "Wednesday";
        String realResult = day.detectDayName(3);
        check(expectedResult.equals(realResult), "daySwitchTest");
    }

    public void DayOfTheWeekSwitchTest1() {
        DayOfTheWeekDetector day = new DayOfTheWeekSwitch();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = day.detectDayName(8);
        check(expectedResult.equals(realResult), "notDaySwitchTest");
    }

    public void DayOfTheWeekDetectorIfVersionTest() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Tuesday";
        String realResult = day.detectDayName(2);
        check(expectedResult.equals(realResult), "detectorIfVersionTest");
    }

    public void DayOfTheWeekDetectorIfVersionTest1() {
        DayOfTheWeekDetector day = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = day.detectDayName(8);
        check(expectedResult.equals(realResult), "detectorIfVersionTest notDay");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
