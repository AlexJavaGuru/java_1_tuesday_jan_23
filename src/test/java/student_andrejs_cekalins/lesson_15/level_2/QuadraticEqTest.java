package student_andrejs_cekalins.lesson_15.level_2;

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
    void calc() {
        String expected = "x1 = -8.0, x2 = 6.0";
        String actual = quadraticEq.calc(1, 2, -48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void discriminantEqualsThanZero() {
        String expected = "x = -1.0";
        String actual = quadraticEq.calc(1, 2, 1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void discriminantLessThanZero() {
        String expected = "Equation has no roots";
        String actual = quadraticEq.calc(1, 2, 2);
        assertThat(actual).isEqualTo(expected);
    }
}