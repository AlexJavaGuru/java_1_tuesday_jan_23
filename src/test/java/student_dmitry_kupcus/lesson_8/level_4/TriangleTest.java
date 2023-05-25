package student_dmitry_kupcus.lesson_8.level_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle("Rectangle", 20, 20, 10);
    }

    @Test
    void testCalculateArea() {
        double expectedResult = 96.82458365518542;
        double actualResult = triangle.calculateArea();
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void testCalculatePerimeter() {
        double expectedResult = 50;
        double actualResult = triangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult);
    }
}