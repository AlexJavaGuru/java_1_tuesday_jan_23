package student_andrejs_cekalins.lesson_11.level_5_6_and_7;


import student_andrejs_cekalins.lesson_11.level_4.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    private List<FraudRule> fraudRules;

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
        return new FraudDetectionResult(false, detectedRules);
    }
}
