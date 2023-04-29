package student_vladislav_romanov.lesson_11.level_4_5_6;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {

    List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction transaction) {
        List<String> detectedRules = new ArrayList<>();
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                detectedRules.add(fraudRule.getRuleName());
            }
        }
        if (detectedRules.size() > 0) {
            System.out.println("Fraud DETECTED! " + transaction);
            return new FraudDetectionResult(true, detectedRules);
        }
        return new FraudDetectionResult(false);
    }
}
