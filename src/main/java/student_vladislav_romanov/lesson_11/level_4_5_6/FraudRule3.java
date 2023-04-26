package student_vladislav_romanov.lesson_11.level_4_5_6;

public class FraudRule3 extends FraudRule {

    private String ruleName;

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Сидней");
    }

}
