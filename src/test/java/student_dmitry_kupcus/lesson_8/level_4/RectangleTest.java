package student_dmitry_kupcus.lesson_8.level_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle("Rectangle", 4, 5);

    }

    @Test
    void testCalculateArea() {
        double expectedResult = 20;
        double actualResult = rectangle.calculateArea();
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void testCalculatePerimeter() {
        double expectedResult = 18;
        double actualResult = rectangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult);
    }
}