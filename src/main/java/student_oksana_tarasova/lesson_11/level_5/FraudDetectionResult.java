package student_oksana_tarasova.lesson_11.level_5;

public class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public FraudDetectionResult(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public String toString() {
        return "FraudDetectionResult{" +
                "fraud=" + fraud +
                ", ruleName='" + ruleName + '\'' +
                '}';
    }
}
