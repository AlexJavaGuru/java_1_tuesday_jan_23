package student_andrejs_cekalins.lesson_15.level_2.Task_9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
private FraudDetector fraudDetector;
    @BeforeEach
    void setUp() {
        fraudDetector = new FraudDetector();


    }

    @Test
    void isFraudTrader() {
        Trader trader = new Trader("Pokemon", "Riga");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(trader);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void isNotFraudTrader() {
        Trader trader = new Trader("Andrejs", "Riga");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(trader);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void isFraudCity() {
        Trader trader = new Trader("Andrejs", "Sidney");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(trader);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void isNotFraudCity() {
        Trader trader = new Trader("Andrejs", "Riga");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(trader);
        assertThat(actual).isEqualTo(expected);
    }
}