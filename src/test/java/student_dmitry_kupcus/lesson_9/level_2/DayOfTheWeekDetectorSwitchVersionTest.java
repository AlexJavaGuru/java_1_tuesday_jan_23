package student_dmitry_kupcus.lesson_9.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekDetectorSwitchVersionTest {
    private DayOfTheWeekDetector dayOfTheWeekDetectorSwitchVersion;

    @BeforeEach
    void setUp() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
    }

    @Test
    void testDetectDayNameSwitchVersionMonday() {
        String expectedResult = "Monday";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameSwitchVersionTuesday() {
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameSwitchVersionWednesday() {
        String expectedResult = "Wednesday";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameSwitchVersionThursday() {
        String expectedResult = "Thursday";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameSwitchVersionFriday() {
        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameSwitchVersionSaturday() {
        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(6);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameSwitchVersionSunday() {
        String expectedResult = "Sunday";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(7);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDetectDayNameSwitchVersionFailed() {
        String expectedResult = "Please write number between 1 and 7";
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(8);
        assertEquals(expectedResult, actualResult);
    }
}