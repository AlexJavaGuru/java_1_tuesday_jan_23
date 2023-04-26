package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import student_andrejs_cekalins.lesson_11.level_4.Transaction;

abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);
}
