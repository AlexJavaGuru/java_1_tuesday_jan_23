package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_andrejs_cekalins.lesson_11.level_4.Trader;
import student_andrejs_cekalins.lesson_11.level_4.Transaction;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class FraudDetectorTest {
    private FraudDetector fraudDetector;

    @BeforeEach
    void setUp() {
        List<FraudRule> fraudRules = new ArrayList<>();
        FraudRule fraudRule1 = new FraudRule1("Trader Pokemon");
        FraudRule fraudRule2 = new FraudRule2("Sum moe than 1000000");
        FraudRule fraudRule3 = new FraudRule3("Traders from Sydney");
        FraudRule fraudRule4 = new FraudRule4("Traders from Jamaica");
        FraudRule fraudRule5 = new FraudRule5("Traders from Germany amount more than 1000");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);
        fraudDetector = new FraudDetector(fraudRules);
    }

    @Test
    void testFraudRuleList() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 2000);
        FraudDetectionResult actual = fraudDetector.isFraud(pokemonTransaction);
        List<FraudDetectionResult> result = List.of(actual);
        assertThat(result).hasSize(1);
    }
}