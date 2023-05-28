package student_konstantin_kudrjavtsev.lesson_7.level_5_middle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTestTest {

    PowerCalculator powerCalculator;

    @BeforeEach
    void setUp() {
        powerCalculator = new PowerCalculator();

    }

    @Test
    void raisingAGivenNumberToAPower() {
        int expected = 32;
        double actual = powerCalculator.raisingAGivenNumberToAPower(2,5);
        assertEquals(expected, actual);
    }
}
