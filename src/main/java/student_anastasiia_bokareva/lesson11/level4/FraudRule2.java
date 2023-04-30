package student_anastasiia_bokareva.lesson11.level4;

public class FraudRule2 implements FraudRule {
    private String ruleName;

    public FraudRule2(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction t) {
        return (t.getAmount() > 1000000);
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
