package teacher.lesson_11_srp.lessoncode.oldversion.test;

import teacher.lesson_11_srp.lessoncode.oldversion.FraudRul5;
import teacher.lesson_11_srp.lessoncode.oldversion.FraudRule5;
import teacher.lesson_11_srp.lessoncode.oldversion.Trader;
import teacher.lesson_11_srp.lessoncode.oldversion.Transaction;

public class FraudRule5Test {

    public static void executeTests() {
        checkNotAllowedCountryAndAmount();
        checkAllowedCountryAmount();
    }

    private static void checkNotAllowedCountryAndAmount() {
        FraudRule5 checkCountryAmount = new FraudRule5("Germany and 1000");
        Trader someTrader = new Trader("New Trader", "Berlin", "Germany");
        Transaction newTransaction = new Transaction(someTrader, 1000001);
        boolean expectedResult = true;
        boolean calculatedResult = checkCountryAmount.isFraud(newTransaction);
        if (expectedResult == calculatedResult) {
            System.out.println("Test Not allowed country Germany and amount more than 1 000 has PASSED!");
        } else {
            System.out.println("Test Not allowed country Germany and amount more than 1 000  has FAILED!");
        }
    }

    private static void checkAllowedCountryAmount() {
        FraudRul5 checkAmount = new FraudRul5("Check Not allowed amount more than 1 000 000");
        Trader secondTrader = new Trader("New Trader", "Riga", "Latvia");
        Transaction secondTransaction = new Transaction(secondTrader, 500);
        boolean expectedResult = false;
        boolean calculatedResult = checkAmount.isFraud(secondTransaction);
        if (expectedResult == calculatedResult) {
            System.out.println("Test for false PASSED!");
        } else {
            System.out.println("Test for false has FAILED!");
        }
    }
}
