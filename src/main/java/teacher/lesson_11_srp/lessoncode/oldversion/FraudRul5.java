package teacher.lesson_11_srp.lessoncode.oldversion;

public class FraudRul5 implements FraudRule {

    private String ruleName;

    public FraudRul5(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;

    }

    @Override
    public String getRuleName() {
        return ruleName;
    }


}
