package student_anastasiia_bokareva.lesson11.level4;

public class FraudRule3 implements FraudRule {
    private String ruleName;

    public FraudRule3(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCity().equals("Sydney"));

    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
