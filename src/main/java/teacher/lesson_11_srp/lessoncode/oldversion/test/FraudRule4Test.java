package teacher.lesson_11_srp.lessoncode.oldversion.test;

import teacher.lesson_11_srp.lessoncode.oldversion.FraudRule4;
import teacher.lesson_11_srp.lessoncode.oldversion.Trader;
import teacher.lesson_11_srp.lessoncode.oldversion.Transaction;

public class FraudRule4Test {

    static void isTransactionFromJamaica() {
        Trader javaguru = new Trader("JavaGuru", "Kingstown", "Ямайка");
        Transaction transactionFromJamaica = new Transaction(javaguru, 1000000);
        FraudRule4 fraudRule4 = new FraudRule4("isTransactionFromJamaica");
        boolean expected = true;
        boolean current = fraudRule4.isFraud(transactionFromJamaica);
        if (current == expected) {
            System.out.println("Test for transaction from Jamaica has SUCCEED");
        } else {
            System.out.println("Test for transaction from Jamaica has FAILED");
        }
    }

}
