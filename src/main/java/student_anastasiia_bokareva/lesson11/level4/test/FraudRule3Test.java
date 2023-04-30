package student_anastasiia_bokareva.lesson11.level4.test;

import student_anastasiia_bokareva.lesson11.level4.FraudRule3;
import student_anastasiia_bokareva.lesson11.level4.Trader;
import student_anastasiia_bokareva.lesson11.level4.Transaction;

public class FraudRule3Test {

    public static void checkIsFraud() {
        FraudRule3 detector = new FraudRule3("Sydney");
        Trader trader = new Trader("Poke", "Sydney", "Australia");
        Transaction t = new Transaction(trader, 100);
        boolean realResult = detector.isFraud(t);
        boolean expectedResult = true;
        check(realResult, expectedResult, "is Sydney fraud ");
    }

    public static void check(boolean realResult, boolean expectedResult, String nameTest) {
        if (realResult == expectedResult) {
            System.out.println("Test " + nameTest + " is ok!");
        } else {
            System.out.println("Test " + nameTest + " is fail!");
        }
    }
}
