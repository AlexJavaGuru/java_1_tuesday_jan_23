package student_vladislav_romanov.lesson_15.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_vladislav_romanov.lesson_11.level_4_5_6.Trader;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector;

    @BeforeEach
    void setUp() {
        fraudDetector = new FraudDetector();
    }

    @Test
    void isFraudByTraderName() {
        Trader trader = new Trader("Pokemon", "Hong Kong", "China");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(trader);
        assertEquals(expected, actual);
    }

    @Test
    void isFraudByTraderCity() {
        Trader trader = new Trader("Pegasus", "Sidney", "Australia");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(trader);
        assertEquals(expected, actual);
    }

    @Test
    void isNonFraud() {
        Trader trader = new Trader("Pegasus", "Hong Kong", "China");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(trader);
        assertEquals(expected, actual);
    }

}