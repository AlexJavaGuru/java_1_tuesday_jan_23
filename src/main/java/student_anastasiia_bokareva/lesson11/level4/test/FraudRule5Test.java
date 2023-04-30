package student_anastasiia_bokareva.lesson11.level4.test;

import student_anastasiia_bokareva.lesson11.level4.FraudRule5;
import student_anastasiia_bokareva.lesson11.level4.Trader;
import student_anastasiia_bokareva.lesson11.level4.Transaction;

public class FraudRule5Test {

    public static void checkIsFraud() {
        FraudRule5 detector = new FraudRule5("Germany amount > 1000");
        Trader trader = new Trader("Poke", "Rsa", "Germany");
        Transaction t = new Transaction(trader, 1001);
        boolean realResult = detector.isFraud(t);
        boolean expectedResult = true;
        check(realResult, expectedResult, "is Germany fraud ");
    }

    public static void check(boolean realResult, boolean expectedResult, String nameTest) {
        if (realResult == expectedResult) {
            System.out.println("Test " + nameTest + " is ok!");
        } else {
            System.out.println("Test " + nameTest + " is fail!");
        }
    }
}
