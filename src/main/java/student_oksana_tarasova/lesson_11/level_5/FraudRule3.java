package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Transaction;

public class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Sidney")) {
            return true;
        }
        return false;
    }
}
