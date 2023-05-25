package student_dmitry_kupcus.lesson_8.level_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;
    @BeforeEach
    void setUp() {
        circle = new Circle("Circle", 10);
    }

    @Test
    void testCalculateArea() {
        double expectedResult = 314.1592653589793;
        double actualResult = circle.calculateArea();
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void testCalculatePerimeter() {
        double expectedResult = 62.83185307179586;
        double actualResult = circle.calculatePerimeter();
        assertEquals(expectedResult, actualResult);
    }
}