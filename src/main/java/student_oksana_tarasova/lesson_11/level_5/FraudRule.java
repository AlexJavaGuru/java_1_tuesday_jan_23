package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Transaction;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    @Override
    public String toString() {
        return "FraudRule{" +
                "ruleName='" + ruleName + '\'' +
                '}';
    }
}
