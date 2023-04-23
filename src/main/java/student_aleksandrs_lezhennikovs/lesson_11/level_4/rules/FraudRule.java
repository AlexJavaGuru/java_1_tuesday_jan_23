package student_aleksandrs_lezhennikovs.lesson_11.level_4.rules;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;

public abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);


}
