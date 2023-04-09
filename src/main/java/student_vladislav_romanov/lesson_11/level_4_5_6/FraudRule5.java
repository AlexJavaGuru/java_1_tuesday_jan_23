package student_vladislav_romanov.lesson_11.level_4_5_6;

public class FraudRule5 implements FraudRule {
    private String ruleName;

    public FraudRule5(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") &&
                transaction.getAmount() > 1000;
    }
}
