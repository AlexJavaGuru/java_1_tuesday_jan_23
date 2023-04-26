package student_aleksandrs_lezhennikovs.lesson_15.level_2.task_9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FraudDetectorTest {
    FraudDetector fraudDetector;

    @BeforeEach
    void setUp() {
        fraudDetector = new FraudDetector();
    }

    @Test
    void testNotAllowedTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Riga");
        boolean calculated = fraudDetector.isFraud(trader);
        assertThat(calculated).isTrue();
    }

    @Test
    void testNotAllowedTraderFalseCheck() {
        Trader trader = new Trader("Spiderman", "Riga");
        boolean calculated = fraudDetector.isFraud(trader);
        assertThat(calculated).isFalse();
    }

    @Test
    void testNotAllowedCitySidney() {
        Trader trader = new Trader("SomeTrader", "Sidney");
        boolean calculated = fraudDetector.isFraud(trader);
        assertThat(calculated).isTrue();
    }

    @Test
    void testNotAllowedCityFalseCheck() {
        Trader trader = new Trader("Spiderman", "Riga");
        boolean calculated = fraudDetector.isFraud(trader);
        assertThat(calculated).isFalse();
    }
}