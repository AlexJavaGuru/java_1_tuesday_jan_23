package student_anastasiia_bokareva.lesson11.level4;

public class FraudRule1 implements FraudRule {

    private String ruleName;

    public FraudRule1(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction t) {
        return (t.getTrader().getFullName().equals("Pokemon"));
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
