package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import student_andrejs_cekalins.lesson_11.level_4.Transaction;

public class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}
