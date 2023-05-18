package student_aleksandrs_lezhennikovs.lesson_15.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuadraticEqTest {
    QuadraticEq quadraticEq;

    @BeforeEach
    void setUp() {
        quadraticEq = new QuadraticEq();
    }

    @Test
    void testDiscriminantMoreThanZero() {
        String calculated = quadraticEq.calc(1, 2, -24);
        String expected = "x1 = -6.0, x2 = 4.0";
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testDiscriminantIsZero() {
        String calculated = quadraticEq.calc(1, 2, 1);
        String expected = "x = -1.0";
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testDiscriminantLessThenZero() {
        String calculated = quadraticEq.calc(1, 2, 7);
        String expected = "Equation has no roots";
        assertThat(calculated).isEqualTo(expected);
    }
}