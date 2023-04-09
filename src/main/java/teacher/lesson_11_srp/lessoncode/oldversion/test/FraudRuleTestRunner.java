package teacher.lesson_11_srp.lessoncode.oldversion.test;

public class FraudRuleTestRunner {

    public static void main(String[] args) {
        FraudRule1Test.isPokemonTransactio();
        FraudRule2Test.checkNotAllowedAmount();
        FraudRule3Test.isTransactionFromSydney();
        FraudRule4Test.isTransactionFromJamaica();
        FraudRule5Test.executeTests();
    }
}
