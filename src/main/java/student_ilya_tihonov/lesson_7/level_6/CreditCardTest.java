package student_ilya_tihonov.lesson_7.level_6;

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.depositTest();
        test.withdrawTest();
    }

    public static void depositTest() {
        CreditCard card = new CreditCard("1234 5678 9012 3456", 1234, 0, 1000);
        card.setLoanDebt(500);
        card.deposit(1234, 100);
        if (card.getBalance() != 100 || card.getLoanDebt() != 400) {
            System.out.println("Deposit test passed");
        } else {
            System.out.println("Deposit test failed");
        }
    }

    public static void withdrawTest() {
        CreditCard card = new CreditCard("1234 5678 9012 3456", 1234, 500, 1000);
        card.setLoanDebt(0);
        boolean result = card.withdraw(1234, 300);
        if (result && card.getBalance() == 200 && card.getLoanDebt() == 0) {
            System.out.println("Withdraw test 1 passed");
        } else {
            System.out.println("Withdraw test 1 failed");
        }
        result = card.withdraw(1234, 700);
        if (!result && card.getBalance() == 200 && card.getLoanDebt() == 500) {
            System.out.println("Withdraw test 2 passed");
        } else {
            System.out.println("Withdraw test 2 failed");
        }
    }
}
