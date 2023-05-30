package student_dmitry_kupcus.lesson_9.level_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinConverterTest {

    @Test
    void testConvert() {
        KelvinConverter converter = new KelvinConverter();
        double expectedResult = 283.15;
        double actualResult = converter.convert(10);
        assertEquals(expectedResult, actualResult);
    }
}