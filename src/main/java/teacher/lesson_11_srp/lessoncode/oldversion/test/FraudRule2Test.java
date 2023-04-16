package teacher.lesson_11_srp.lessoncode.oldversion.test;

import teacher.lesson_11_srp.lessoncode.oldversion.FraudRul5;
import teacher.lesson_11_srp.lessoncode.oldversion.FraudRule2;
import teacher.lesson_11_srp.lessoncode.oldversion.Trader;
import teacher.lesson_11_srp.lessoncode.oldversion.Transaction;

public class FraudRule2Test {

    public static void checkNotAllowedAmount() {
        FraudRule2 checkAmount = new FraudRule2("Check Not allowed amount more than 1 000 000");
        Trader someTrader = new Trader("New Trader", "Riga", "Latvia");
        Transaction newTransaction = new Transaction(someTrader, 1000001);
        boolean expectedResult = true;
        boolean calculatedResult = checkAmount.isFraud(newTransaction);
        if (expectedResult == calculatedResult) {
            System.out.println("Test Not allowed amount more than 1 000 000 has PASSED!");
        } else {
            System.out.println("Test Not allowed amount more than 1 000 000 has FAILED!");
        }
    }

    public static void checkAllowedAmount() {
        FraudRule2 checkAmount = new FraudRule2("Check Not allowed amount more than 1 000 000");
        Trader secondTrader = new Trader("New Trader", "Riga", "Latvia");
        Transaction secondTransaction = new Transaction(secondTrader, 500);
        boolean expectedResult = false;
        boolean calculatedResult = checkAmount.isFraud(secondTransaction);
        if (expectedResult == calculatedResult) {
            System.out.println("Test allowed amount less than 1 000 000 has PASSED!");
        } else {
            System.out.println("Test allowed amount less than 1 000 000 has FAILED!");
        }
    }
}
