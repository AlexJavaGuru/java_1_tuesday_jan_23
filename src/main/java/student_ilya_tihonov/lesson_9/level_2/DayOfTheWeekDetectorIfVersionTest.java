package student_ilya_tihonov.lesson_9.level_2;

public class DayOfTheWeekDetectorIfVersionTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTest test = new DayOfTheWeekDetectorIfVersionTest();
        test.DayOfTheWeekDetectorIfVersion();
    }

    static void DayOfTheWeekDetectorIfVersion() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();

        String result1 = detector.detectDayName(1);
        if (!result1.equals("Monday")) {
            System.out.println("Test failed for input 1. Expected output: Monday, but got " + result1);
        }

        String result2 = detector.detectDayName(3);
        if (!result2.equals("Wednesday")) {
            System.out.println("Test failed for input 3. Expected output: Wednesday, but got " + result2);
        }
    }

}
