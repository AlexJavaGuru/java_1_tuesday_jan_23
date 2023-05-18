package student_anastasiia_bokareva.lesson11.level4.test;

import student_anastasiia_bokareva.lesson11.level4.FraudRule2;
import student_anastasiia_bokareva.lesson11.level4.FraudRule4;
import student_anastasiia_bokareva.lesson11.level4.Trader;
import student_anastasiia_bokareva.lesson11.level4.Transaction;

public class FraudRule4Test {

    public static void checkIsFraud() {
        FraudRule4 detector = new FraudRule4("Jamaica");
        Trader trader = new Trader("Poke", "Ra", "Jamaica");
        Transaction t = new Transaction(trader, 39);
        boolean realResult = detector.isFraud(t);
        boolean expectedResult = true;
        check(realResult, expectedResult, "is Jamaica fraud ");
    }

    public static void check(boolean realResult, boolean expectedResult, String nameTest) {
        if (realResult == expectedResult) {
            System.out.println("Test " + nameTest + " is ok!");
        } else {
            System.out.println("Test " + nameTest + " is fail!");
        }
    }
}
