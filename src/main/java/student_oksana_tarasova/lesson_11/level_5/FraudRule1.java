package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Transaction;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }
}
