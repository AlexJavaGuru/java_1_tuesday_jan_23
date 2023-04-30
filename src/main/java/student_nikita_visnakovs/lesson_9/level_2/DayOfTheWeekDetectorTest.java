package student_nikita_visnakovs.lesson_9.level_2;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest tester = new DayOfTheWeekDetectorTest();
        tester.correctValueTest();
        tester.notCorrectValueTest();
    }

    public void correctValueTest() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Sunday";
        String actualResult = subject.detectDayName(7);
        checkResult(expectedResult, actualResult, "Correct value test");
    }
    public void notCorrectValueTest() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String actualResult = subject.detectDayName(0);
        checkResult(expectedResult, actualResult, "Not Correct value test");
    }


    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + " failed!!!");
        }
    }
}
