package student_vladislav_romanov.lesson_11.level_4_5_6;

public class FraudRule3 implements FraudRule {

    private String ruleName;

    public FraudRule3(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Сидней");
    }

}
