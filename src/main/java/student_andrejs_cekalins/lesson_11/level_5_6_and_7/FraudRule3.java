package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import student_andrejs_cekalins.lesson_11.level_4.Transaction;

public class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }
}
