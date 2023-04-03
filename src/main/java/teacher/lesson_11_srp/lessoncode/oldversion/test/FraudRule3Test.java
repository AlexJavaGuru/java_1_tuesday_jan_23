package teacher.lesson_11_srp.lessoncode.oldversion.test;

import teacher.lesson_11_srp.lessoncode.oldversion.FraudRule3;
import teacher.lesson_11_srp.lessoncode.oldversion.Trader;
import teacher.lesson_11_srp.lessoncode.oldversion.Transaction;

public class FraudRule3Test {

    static void isTransactionFromSydney() {
        Trader someTrader = new Trader("New Trader", "Сидней", "Australia");
        Transaction sydneyTransaction = new Transaction(someTrader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("isTransactionFromSydney");
        boolean expectResult = true;
        boolean calculatedResult = fraudRule3.isFraud(sydneyTransaction);
        if (expectResult == calculatedResult) {
            System.out.println("Test not allowed Traders city has PASSED!");
        }else {
            System.out.println("Test not allowed Traders city has FAILED!");
        }
    }

}
