package student_dmitry_kupcus.lesson_9.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorArrayVersionTest {
    private DayOfTheWeekDetector dayOfTheWeekDetectorArrayVersion;

    @BeforeEach
    void setUp() {
        dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
    }

    @Test
    void testDetectDayNameArrayVersionMonday() {
        String expectedResult = "Monday";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameArrayVersionTuesday() {
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameArrayVersionWednesday() {
        String expectedResult = "Wednesday";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameArrayVersionThursday() {
        String expectedResult = "Thursday";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameArrayVersionFriday() {
        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameArrayVersionSaturday() {
        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(6);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameArrayVersionSunday() {
        String expectedResult = "Sunday";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(7);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameArrayVersionFailed() {
        String expectedResult = "Please write number between 1 and 7";
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(0);
        assertEquals(expectedResult, actualResult);
    }

}