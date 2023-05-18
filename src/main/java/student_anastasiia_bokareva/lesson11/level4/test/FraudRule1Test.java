package student_anastasiia_bokareva.lesson11.level4.test;

import student_anastasiia_bokareva.lesson11.level4.FraudDetector;
import student_anastasiia_bokareva.lesson11.level4.FraudRule1;
import student_anastasiia_bokareva.lesson11.level4.Trader;
import student_anastasiia_bokareva.lesson11.level4.Transaction;

public class FraudRule1Test {

    public static void checkIsFraud() {
        FraudRule1 detector = new FraudRule1("Pokemon check");
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 123);
        boolean realResult = detector.isFraud(t);
        boolean expectedResult = true;
        check(realResult, expectedResult, "isFraud ");
    }

    public static void check(boolean realResult, boolean expectedResult, String nameTest) {
        if (realResult == expectedResult) {
            System.out.println("Test " + nameTest + " is ok!");
        } else {
            System.out.println("Test " + nameTest + " is fail!");
        }
    }
}
