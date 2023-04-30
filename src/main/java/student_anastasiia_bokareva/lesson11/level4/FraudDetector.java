package student_anastasiia_bokareva.lesson11.level4;

import teacher.lesson_11_srp.lessoncode.oldversion.FraudDetectionResult;

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



    public void checkTransaction(boolean isFraud){
        if (isFraud==true){
            System.out.println("Transaction decline ");
        } else {
            System.out.println("Transaction is ok!");
        }
    }
}

