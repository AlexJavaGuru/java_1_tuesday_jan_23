package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import java.util.List;

public class FraudDetectionResult {
    private boolean isFraud;
    private List<String> ruleName;

    FraudDetectionResult(boolean isFraud, List<String> ruleName) {
        this.isFraud = isFraud;
        this.ruleName = ruleName;
    }

    public void setIsFraud(boolean fraud) {
        this.isFraud = fraud;
    }

    public void setRuleName(List<String> ruleName) {
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public List<String> getRuleName() {
        return ruleName;
    }

    @Override
    public String toString() {
        return "FraudDetectionResult {" +
                "isFraud ='" + isFraud + '\'' +
                ", ruleName ='" + ruleName + '\'' +
                '}';
    }
}
