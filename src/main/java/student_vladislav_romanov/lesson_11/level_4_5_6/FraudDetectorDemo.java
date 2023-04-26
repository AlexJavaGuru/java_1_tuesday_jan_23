package student_vladislav_romanov.lesson_11.level_4_5_6;

import java.util.List;

public class FraudDetectorDemo {

    public static void main(String[] args) {
        List<FraudRule> fraudRules = List.of(
                new FraudRule1("FraudRule1"),
                new FraudRule2("FraudRule2"),
                new FraudRule3("FraudRule3"),
                new FraudRule4("FraudRule4"),
                new FraudRule5("FraudRule5")
        );
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader pokemon = new Trader("Pokemon", "Berlin", "Germany");
        Transaction pokemonTransaction = new Transaction(pokemon, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(pokemonTransaction);
        System.out.println(result);
    }
}
