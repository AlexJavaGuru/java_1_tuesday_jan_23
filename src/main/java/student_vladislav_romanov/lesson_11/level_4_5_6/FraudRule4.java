package student_vladislav_romanov.lesson_11.level_4_5_6;

public class FraudRule4 implements FraudRule {

    private String ruleName;

    public FraudRule4(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Ямайка");
    }
}
