package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Transaction;

public class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }
}
