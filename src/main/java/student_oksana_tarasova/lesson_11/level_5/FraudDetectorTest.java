package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Trader;
import student_oksana_tarasova.lesson_11.level_4.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.saveTest();
        test.pokemonTest();
        test.sidneyTest();
        test.moreMillionTest();
        test.moreMillionTest1();
        test.jamaicaTest();
        test.germanyTest();
        test.germanyTest1();
    }

    public void saveTest() {
        List<FraudRule> rules = new ArrayList<>();
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudRule fraudRule = new FraudRule1("userPokemon");
        fraudDetector.saveRule(fraudRule);
        check(fraudDetector.getRules().contains(fraudRule), "userPokemon is save");
    }

    public void pokemonTest() {
        FraudDetector fraudDetector = new FraudDetector(saveRule());
        Transaction transactionPokemon = new Transaction(new Trader("Pokemon", "Turin", "Italia"), 100);
        FraudDetectionResult realResult = fraudDetector.isFraud(transactionPokemon);
        check(realResult.getRuleName().equals("User Pokemon"), "PokemonTest");
    }

    public void sidneyTest() {
        FraudDetector fraudDetector = new FraudDetector(saveRule());
        Transaction transactionSidney = new Transaction(new Trader("Ivanov", "Sidney", "Italia"), 100);
        FraudDetectionResult realResult = fraudDetector.isFraud(transactionSidney);
        check(realResult.getRuleName().equals("Sidney"), "Sidney");
    }

    public void moreMillionTest() {
        FraudDetector fraudDetector = new FraudDetector(saveRule());
        Transaction transactionMillion = new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000000);
        FraudDetectionResult realResult = fraudDetector.isFraud(transactionMillion);
        check(realResult.getRuleName() == null, "More million");
    }

    public void moreMillionTest1() {
        FraudDetector fraudDetector = new FraudDetector(saveRule());
        Transaction transactionMillion = new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000001);
        FraudDetectionResult realResult = fraudDetector.isFraud(transactionMillion);
        check(realResult.getRuleName().equals("More million"), "More million");
    }

    public void jamaicaTest() {
        FraudDetector fraudDetector = new FraudDetector(saveRule());
        Transaction transactionJamaica = new Transaction(new Trader("Ivanov", "Turin", "Jamaica"), 10000);
        FraudDetectionResult realResult = fraudDetector.isFraud(transactionJamaica);
        check(realResult.getRuleName().equals("Jamaica"), "Jamaica");
    }

    public void germanyTest() {
        FraudDetector fraudDetector = new FraudDetector(saveRule());
        Transaction transactionGermany = new Transaction(new Trader("Ivanov", "Turin", "Germany"), 1001);
        FraudDetectionResult realResult = fraudDetector.isFraud(transactionGermany);
        check(realResult.getRuleName().equals("Germany, more 1000"), "Germany, more 1000");
    }

    public void germanyTest1() {
        FraudDetector fraudDetector = new FraudDetector(saveRule());
        Transaction transactionGermany = new Transaction(new Trader("Ivanov", "Turin", "Germany"), 100);
        FraudDetectionResult realResult = fraudDetector.isFraud(transactionGermany);
        check(realResult.getRuleName() == null,"Germany, < 1000") ;
    }

    public static List<FraudRule> saveRule() {
        List<FraudRule> rules = new ArrayList<>();
        rules.add(0, new FraudRule1("User Pokemon"));
        rules.add(1, new FraudRule2("More million"));
        rules.add(2, new FraudRule3("Sidney"));
        rules.add(3, new FraudRule4("Jamaica"));
        rules.add(4, new FraudRule5("Germany, more 1000"));
        return rules;
    }

    public  void  check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " is passed");
        } else {
            System.out.println(nameTest + " is failed");
        }
    }

}
