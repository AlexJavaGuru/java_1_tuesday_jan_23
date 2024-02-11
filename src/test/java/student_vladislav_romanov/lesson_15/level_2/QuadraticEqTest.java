package student_vladislav_romanov.lesson_15.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {

    QuadraticEq quadraticEq;

    @BeforeEach
    void setUp() {
        quadraticEq = new QuadraticEq();
    }

    @Test
    void getRootWhenDiscriminantGreaterThanZero() {
        String expected = "x1 = -4.0, x2 = 0.5";
        String actual = quadraticEq.calc(2, 7, -4);
        assertEquals(expected, actual);
    }

    @Test
    void getRootWhenDiscriminantEqualsZero() {
        String expected = "x = 2.0";
        String actual = quadraticEq.calc(1, -4, 4);
        assertEquals(expected, actual);
    }

    @Test
    void getRootWhenDiscriminantNegative() {
        String expected = "Equation has no roots";
        String actual = quadraticEq.calc(3, -1, 7);
        assertEquals(expected, actual);
    }
}