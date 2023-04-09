package student_vladislav_romanov.lesson_11.level_4_5_6;

public class FraudRule2 extends FraudRule {

    private String ruleName;

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
