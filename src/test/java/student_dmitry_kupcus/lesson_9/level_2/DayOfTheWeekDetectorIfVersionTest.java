package student_dmitry_kupcus.lesson_9.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorIfVersionTest {
    private DayOfTheWeekDetector dayOfTheWeekDetectorIfVersion;

    @BeforeEach
    void setUp() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
    }

    @Test
    void testDetectDayNameIfVersionMonday() {
        String expectedResult = "Monday";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameIfVersionTuesday() {
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameIfVersionWednesday() {
        String expectedResult = "Wednesday";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameIfVersionThursday() {
        String expectedResult = "Thursday";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameIfVersionFriday() {
        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameIfVersionSaturday() {
        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(6);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameIfVersionSunday() {
        String expectedResult = "Sunday";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(7);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameIfVersionFailed() {
        String expectedResult = "Please write number between 1 and 7";
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(8);
        assertEquals(expectedResult, actualResult);
    }
}