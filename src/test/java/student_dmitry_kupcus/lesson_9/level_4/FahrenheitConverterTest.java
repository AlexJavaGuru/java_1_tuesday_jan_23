package student_dmitry_kupcus.lesson_9.level_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitConverterTest {

    @Test
    void testConvert() {
        FahrenheitConverter converter = new FahrenheitConverter();
        double expectedResult = 50;
        double actualResult = converter.convert(10);
        assertEquals(expectedResult, actualResult);
    }
}