package student_vladislav_romanov.lesson_11.level_4_5_6;

import student_vladislav_romanov.TestUtil;

class FraudRuleTestRunner extends TestUtil {

    public static void main(String[] args) {
        FraudRuleTestRunner fraudRuleTestRunner = new FraudRuleTestRunner();
        fraudRuleTestRunner.isPokemonTransactionSucceed();
        fraudRuleTestRunner.isPokemonTransactionFailed();
        fraudRuleTestRunner.checkNotAllowedAmountSucceed();
        fraudRuleTestRunner.checkNotAllowedAmountFailed();
        fraudRuleTestRunner.isTransactionFromSydneySucceed();
        fraudRuleTestRunner.isTransactionFromSydneyFailed();
        fraudRuleTestRunner.printStat();
    }

    private void isPokemonTransactionSucceed() {
        Trader pokemon = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(pokemon, 2000);
        FraudRule1 fraudRule1 = new FraudRule1("isPokemonTransaction");
        boolean expectedResult = true;
        boolean currentResult = fraudRule1.isFraud(pokemonTransaction);
        printResult(currentResult == expectedResult, "isPokemonTransactionSucceed");
    }

    private void isPokemonTransactionFailed() {
        Trader pokemon = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(pokemon, 2000);
        FraudRule1 fraudRule1 = new FraudRule1("isPokemonTransaction");
        boolean expectedResult = false;
        boolean currentResult = fraudRule1.isFraud(pokemonTransaction);
        printResult(currentResult != expectedResult, "isPokemonTransactionFailed");
    }

    private void checkNotAllowedAmountSucceed() {
        FraudRule2 checkAmount = new FraudRule2("Check Not allowed amount more than 1 000 000");
        Trader someTrader = new Trader("New Trader", "Riga", "Latvia");
        Transaction newTransaction = new Transaction(someTrader, 1000001);
        boolean expectedResult = true;
        boolean currentResult = checkAmount.isFraud(newTransaction);
        printResult(currentResult == expectedResult, "checkNotAllowedAmountSucceed");
    }

    private void checkNotAllowedAmountFailed() {
        FraudRule2 checkAmount = new FraudRule2("Check Not allowed amount more than 1 000 000");
        Trader someTrader = new Trader("New Trader", "Riga", "Latvia");
        Transaction newTransaction = new Transaction(someTrader, 1000001);
        boolean expectedResult = false;
        boolean currentResult = checkAmount.isFraud(newTransaction);
        printResult(currentResult != expectedResult, "checkNotAllowedAmountFailed");
    }

    private void isTransactionFromSydneySucceed() {
        Trader someTrader = new Trader("New Trader", "Сидней", "Australia");
        Transaction sydneyTransaction = new Transaction(someTrader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("isTransactionFromSydney");
        boolean expectedResult = true;
        boolean currentResult = fraudRule3.isFraud(sydneyTransaction);
        printResult(currentResult == expectedResult, "isTransactionFromSydneySucceed");
    }

    private void isTransactionFromSydneyFailed() {
        Trader someTrader = new Trader("New Trader", "Канберра", "Australia");
        Transaction sydneyTransaction = new Transaction(someTrader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("isTransactionFromSydney");
        boolean expectedResult = true;
        boolean currentResult = fraudRule3.isFraud(sydneyTransaction);
        printResult(currentResult != expectedResult, "isTransactionFromSydneyFailed");
    }
}
