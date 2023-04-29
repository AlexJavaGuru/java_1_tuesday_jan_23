package student_vladislav_romanov.lesson_11.level_4_5_6;

import java.util.List;

public class FraudDetectionResult {

    private boolean isFraud;
    private List<String> ruleName;

    public FraudDetectionResult(boolean isFraud, List<String> ruleName) {
        this.isFraud = isFraud;
        this.ruleName = ruleName;
    }

    public FraudDetectionResult(boolean isFraud) {
        this.isFraud = isFraud;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public List<String> getRuleName() {
        return ruleName;
    }

    public void setRuleName(List<String> ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public String toString() {
        return "FraudDetectionResult{" +
                "isFraud=" + isFraud +
                ", ruleName=" + ruleName +
                '}';
    }
}
