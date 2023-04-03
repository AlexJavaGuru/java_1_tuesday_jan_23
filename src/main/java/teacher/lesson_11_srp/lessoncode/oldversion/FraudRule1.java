package teacher.lesson_11_srp.lessoncode.oldversion;

public class FraudRule1 implements FraudRule {

    private String ruleName;

    public FraudRule1(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }
}
