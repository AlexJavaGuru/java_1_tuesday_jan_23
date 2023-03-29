package teacher.lesson_11_srp.lessoncode.oldversion;

public class FraudRule2 implements FraudRule {

    private String ruleName;

    public FraudRule2(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
