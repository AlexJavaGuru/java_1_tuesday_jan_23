package student_vladislav_romanov.lesson_11.level_4_5_6;

import student_vladislav_romanov.TestUtil;

class FraudRuleTestRunner extends TestUtil {

    public static void main(String[] args) {
        FraudRuleTestRunner fraudRuleTestRunner = new FraudRuleTestRunner();
        fraudRuleTestRunner.isPokemonTransactionSucceed();
        fraudRuleTestRunner.isPokemonTransactionFailed();
        fraudRuleTestRunner.printStat();
    }

    private void isPokemonTransactionSucceed() {
        Trader pokemon = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(pokemon, 2000);
        FraudRule1 fraudRule1 = new FraudRule1("isPokemonTransaction");
        boolean expectResult = true;
        boolean calculateResult = fraudRule1.isFraud(pokemonTransaction);
        printResult(expectResult == calculateResult, "isPokemonTransactionSucceed");
    }

    private void isPokemonTransactionFailed() {
        Trader pokemon = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(pokemon, 2000);
        FraudRule1 fraudRule1 = new FraudRule1("isPokemonTransaction");
        boolean expectResult = false;
        boolean calculateResult = fraudRule1.isFraud(pokemonTransaction);
        printResult(expectResult != calculateResult, "isPokemonTransactionFailed");
    }
}
