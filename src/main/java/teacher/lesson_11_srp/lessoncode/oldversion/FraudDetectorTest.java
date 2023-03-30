package teacher.lesson_11_srp.lessoncode.oldversion;

import java.util.List;

public class FraudDetectorTest {

    public static void main(String[] args) {
        checkIsFraud();
        checkIsFraudRuleNameReturned();
//        checkTraderNotAllowedName();
//        checkNotAllowedCity();
//        checkTransactionAmount();
//        checkTransactionCountry();
//        checkTransactionFromGermany();
    }

    private static void checkIsFraud() {
        List<FraudRule> fraudRules = List.of(
                new FraudRule1("FraudRule1"),
                new FraudRule2("FraudRule2"),
                new FraudRule3("FraudRule3"),
                new FraudRule4("FraudRule4"),
                new FraudRule5("FraudRule5")
        );
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader pokemon = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(pokemon, 2000);
        FraudDetectionResult result = fraudDetector.isFraud(pokemonTransaction);
        if ("FraudRule1".equals(result.getRuleName())) {
            System.out.println("Test not allowed Traders name has PASSED!");
        } else {
            System.out.println("Test not allowed Traders name has FAILED");
        }
    }

    private static void checkIsFraudRuleNameReturned() {
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
        System.out.println();
    }

//
//    private static void checkTraderNotAllowedName() {
//        Trader pokemon = new Trader("Pokemon", "Riga", "Latvia");
//        Transaction pokemonTransaction = new Transaction(pokemon, 2000);
//        FraudDetector detectName = new FraudDetector();
//        boolean expectResult = true;
//        boolean calculateResult = detectName.isFraud(pokemonTransaction);
//        if (expectResult == calculateResult) {
//            System.out.println("Test not allowed Traders name has PASSED!");
//        } else {
//            System.out.println("Test not allowed Traders name has FAILED");
//        }
//    }
//
//    private static void checkTransactionAmount() {
//        Trader javaguru = new Trader("JavaGuru", "Jurmala", "Latvia");
//        Transaction millionTransaction = new Transaction(javaguru, 1000001);
//        FraudDetector detectMillion = new FraudDetector();
//        boolean expected = true;
//        boolean current = detectMillion.isFraud(millionTransaction);
//        if (current == expected) {
//            System.out.println("Test for amount exceeded 1 million has SUCCEED");
//        } else {
//            System.out.println("Test for amount exceeded 1 million has FAILED");
//        }
//    }
//
//    private static void checkNotAllowedCity() {
//        Trader someTrader = new Trader("New Trader", "Сидней", "Australia");
//        Transaction sydneyTransaction = new Transaction(someTrader, 1000);
//        FraudDetector detectCity = new FraudDetector();
//        boolean expectResult = true;
//        boolean calculatedResult = detectCity.isFraud(sydneyTransaction);
//        if (expectResult == calculatedResult) {
//            System.out.println("Test not allowed Traders city has PASSED!");
//        }else {
//            System.out.println("Test not allowed Traders city has FAILED!");
//        }
//    }
//
//    private static void checkTransactionCountry() {
//        Trader javaguru = new Trader("JavaGuru", "Kingstown", "Ямайка");
//        Transaction transactionFromJamaica = new Transaction(javaguru, 1000000);
//        FraudDetector detectCountry = new FraudDetector();
//        boolean expected = true;
//        boolean current = detectCountry.isFraud(transactionFromJamaica);
//        if (current == expected) {
//            System.out.println("Test for transaction from Jamaica has SUCCEED");
//        } else {
//            System.out.println("Test for transaction from Jamaica has FAILED");
//        }
//    }
//
//    private static void checkTransactionFromGermany() {
//        Trader javaguru = new Trader("JavaGuru", "Berlin", "Germany");
//        Transaction transactionFromGermany = new Transaction(javaguru, 1001);
//        FraudDetector detectTransactionFromGermany = new FraudDetector();
//        boolean expected = true;
//        boolean current = detectTransactionFromGermany.isFraud(transactionFromGermany);
//        if (current == expected) {
//            System.out.println("Test for transaction more than 1000 from Germany has SUCCEED");
//        } else {
//            System.out.println("Test for transaction more than 1000 from Germany has FAILED");
//        }
//    }
}
