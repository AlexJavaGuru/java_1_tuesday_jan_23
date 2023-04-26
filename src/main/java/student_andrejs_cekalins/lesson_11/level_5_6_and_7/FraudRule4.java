package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import student_andrejs_cekalins.lesson_11.level_4.Transaction;

public class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }
}
