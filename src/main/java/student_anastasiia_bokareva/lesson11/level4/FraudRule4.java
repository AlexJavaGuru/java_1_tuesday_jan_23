package student_anastasiia_bokareva.lesson11.level4;

public class FraudRule4 implements FraudRule {
    private String ruleName;

    public FraudRule4(String ruleName) {
        this.ruleName = ruleName;
    }


    @Override
    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Jamaica"));
    }
}
