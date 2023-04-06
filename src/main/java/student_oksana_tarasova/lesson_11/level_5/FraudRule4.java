package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Transaction;

public class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
       if (t.getTrader().getCountry().equals("Jamaica")) {
           return true;
       }
        return false;
    }
}
