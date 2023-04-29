package student_vladislav_romanov.lesson_11.level_4_5_6;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);

    public String getRuleName() {
        return ruleName;
    }
}
