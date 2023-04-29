package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import student_andrejs_cekalins.lesson_11.level_4.Transaction;

public class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }
}
