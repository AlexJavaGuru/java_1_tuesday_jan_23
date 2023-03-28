package teacher.lesson_11_srp.lessoncode.oldversion;

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
