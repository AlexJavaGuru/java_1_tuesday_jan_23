package student_aleksandrs_lezhennikovs.lesson_11.level_4.services;

import java.util.List;

public class FraudDetectionResult {
    private boolean fraud;
    private List<String> ruleName;

    public FraudDetectionResult(boolean fraud, List<String> ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public FraudDetectionResult(boolean fraud) {
        this.fraud = fraud;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public List<String> getRuleName() {
        return ruleName;
    }

    public void setRuleName(List<String> ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public String toString() {
        return "FraudDetectionResult{\n" +
                "fraud=" + fraud +
                ", ruleName=" + ruleName +
                '}';
    }
}
