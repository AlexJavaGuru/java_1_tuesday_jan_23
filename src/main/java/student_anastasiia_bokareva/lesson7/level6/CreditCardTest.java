package student_anastasiia_bokareva.lesson7.level6;

import java.util.concurrent.Callable;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.depositM();
        test.withDraw();



    }

    public int depositM() {
        CreditCard card = new CreditCard(32,000,100);
        int deposit = card.deposit(000,10);
        int expected = 10;
        int real = card.getBalance();
        check(real, expected, "deposit");
        return deposit;

    }

    public void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(" Test " + testName + " is ok");
        } else {
            System.out.println(" Test " + testName + " is fail");
        }
    }

    public int withDraw() {
        CreditCard card = new CreditCard(56,000,100);
        int balance = card.deposit(000,100);
        card.withdraw(000,50);
        int expectResult = 50;
        int realResult = card.getBalance();
        check(expectResult,realResult," withdraw ");
        return realResult;
    }
}


