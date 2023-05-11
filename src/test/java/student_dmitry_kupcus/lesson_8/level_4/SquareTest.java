package student_dmitry_kupcus.lesson_8.level_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square("Square", 10);

    }

    @Test
    void testCalculateArea() {
        double expectedResult = 100;
        double actualResult = square.calculateArea();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCalculatePerimeter() {
        double expectedResult = 40;
        double actualResult = square.calculatePerimeter();
        assertEquals(expectedResult, actualResult);
    }

}