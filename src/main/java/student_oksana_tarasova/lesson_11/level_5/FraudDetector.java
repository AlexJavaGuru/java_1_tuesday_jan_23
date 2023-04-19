package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Transaction;

import java.util.List;

public class FraudDetector {

    List<FraudRule> rules;

    public FraudDetector(List<FraudRule> rules) {
        this.rules = rules;
    }

    public List<FraudRule> getRules() {
        return rules;
    }

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : rules) {
            if (fraudRule.isFraud(transaction)) {
                return new FraudDetectionResult(false, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(true);
    }

    public void saveRule(FraudRule fraudRule) {
        rules.add(fraudRule);
    }

    @Override
    public String toString() {
        return "FraudDetector{" +
                "rules=" + rules +
                '}';
    }
}
