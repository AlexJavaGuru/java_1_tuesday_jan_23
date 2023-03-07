package student_vladislav_romanov.lesson_7.level_6;

class CreditCardTest {

    int succeedTests;
    int failedTests;

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositTestSucceed();
        creditCardTest.depositTestFailed();
        creditCardTest.proceedDepositAmountCheckTestSucceed();
        creditCardTest.proceedDepositAmountCheckTestFailed();
        creditCardTest.proceedDepositDebtCheckTestSucceed();
        creditCardTest.proceedDepositDebtCheckTestFailed();
        creditCardTest.withdrawTestSucceed();
        creditCardTest.withdrawTestFailed();
        creditCardTest.proceedWithdrawAmountCheckTestSucceed();
        creditCardTest.proceedWithdrawAmountCheckTestFailed();
        creditCardTest.proceedWithdrawFromBalanceTestSucceed();
        creditCardTest.proceedWithdrawFromBalanceTestFailed();
        creditCardTest.proceedWithdrawFromCreditLimitTestSucceed();
        creditCardTest.proceedWithdrawFromCreditLimitTestFailed();
        creditCardTest.increaseLimitTestSucceed();
        creditCardTest.increaseLimitTestFailed();
        creditCardTest.decreaseLimitTestSucceed();
        creditCardTest.decreaseLimitTestFailed();
        creditCardTest.decreaseLimitAmountCheckTestSucceed();
        creditCardTest.decreaseLimitAmountCheckTestFailed();
        creditCardTest.checkPinTestSucceed();
        creditCardTest.checkPinTestFailed();
        creditCardTest.checkAmountTestSucceed();
        creditCardTest.checkAmountTestFailed();
        creditCardTest.checkDebtTestSucceed();
        creditCardTest.checkDebtTestFailed();
        creditCardTest.cashDepositTestSucceed();
        creditCardTest.cashDepositTestFailed();
        creditCardTest.debtRepayTestSucceed();
        creditCardTest.debtRepayTestFailed();
        creditCardTest.printStat();
    }

    public void depositTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.deposit(1234, 800);
        double expected = 800;
        double current = creditCard.getBalance();
        printResult(current == expected, "depositTestSucceed");
    }

    public void depositTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.deposit(1234, 800);
        double expected = 1000;
        double current = creditCard.getBalance();
        printResult(current != expected, "depositTestFailed");
    }

    public void proceedDepositAmountCheckTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.proceedDepositAmountCheck(1000);
        double expected = 1000;
        double current = creditCard.getBalance();
        printResult(current == expected, "proceedDepositAmountCheckTestSucceed");
    }

    public void proceedDepositAmountCheckTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.proceedDepositAmountCheck(-1000);
        double expected = 1000;
        double current = creditCard.getBalance();
        printResult(current != expected, "proceedDepositAmountCheckTestFailed");
    }

    public void proceedDepositDebtCheckTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.proceedDepositDebtCheck(1000);
        double expected = 1000;
        double current = creditCard.getBalance();
        printResult(current == expected, "proceedDepositDebtCheckTestSucceed");
    }

    public void proceedDepositDebtCheckTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setDebt(1000);
        creditCard.proceedDepositDebtCheck(1000);
        double expected = 1000;
        double current = creditCard.getBalance();
        printResult(current != expected, "proceedDepositDebtCheckTestFailed");
    }

    public void withdrawTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setBalance(1500);
        creditCard.withdraw(1234,1000);
        double expected = 500;
        double current = creditCard.getBalance();
        printResult(current == expected, "withdrawTestSucceed");
    }

    public void withdrawTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setBalance(1000);
        creditCard.withdraw(1234,3000);
        double expected = -2000;
        double current = creditCard.getBalance();
        printResult(current != expected, "withdrawTestFailed");
    }

    public void proceedWithdrawAmountCheckTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setBalance(1500);
        creditCard.withdraw(1234,1000);
        double expected = 500;
        double current = creditCard.getBalance();
        printResult(current == expected, "proceedWithdrawAmountCheckTestSucceed");
    }

    public void proceedWithdrawAmountCheckTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setBalance(1500);
        creditCard.withdraw(1234,-2000);
        double expected = 500;
        double current = creditCard.getBalance();
        printResult(current != expected, "proceedWithdrawAmountCheckTestFailed");
    }

    public void proceedWithdrawFromBalanceTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setBalance(1500);
        creditCard.setLimit(1000);
        creditCard.withdraw(1234,2000);
        double expected = 500;
        double current = creditCard.getBalance();
        printResult(current == expected, "proceedWithdrawFromBalanceTestSucceed");
    }

    public void proceedWithdrawFromBalanceTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setBalance(1500);
        creditCard.withdraw(1234,1000);
        double expected = 1000;
        double current = creditCard.getBalance();
        printResult(current != expected, "proceedWithdrawFromBalanceTestFailed");
    }

    public void proceedWithdrawFromCreditLimitTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setLimit(1500);
        creditCard.proceedWithdrawFromCreditLimit(1000);
        double expected = 1000;
        double current = creditCard.getDebt();
        printResult(current == expected, "proceedWithdrawFromCreditLimitTestSucceed");
    }

    public void proceedWithdrawFromCreditLimitTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setLimit(1500);
        creditCard.proceedWithdrawFromCreditLimit(2000);
        double expected = 500;
        double current = creditCard.getDebt();
        printResult(current != expected, "proceedWithdrawFromCreditLimitTestFailed");
    }

    public void increaseLimitTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setLimit(1500);
        creditCard.increaseLimit(500);
        double expected = 2000;
        double current = creditCard.getLimit();
        printResult(current == expected, "increaseLimitTestSucceed");
    }

    public void increaseLimitTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.increaseLimit(-500);
        double expected = 1000;
        double current = creditCard.getLimit();
        printResult(current != expected, "increaseLimitTestFailed");
    }

    public void decreaseLimitTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setLimit(1500);
        creditCard.decreaseLimit(500);
        double expected = 1000;
        double current = creditCard.getLimit();
        printResult(current == expected, "decreaseLimitTestSucceed");
    }

    public void decreaseLimitTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setLimit(1500);
        creditCard.setDebt(500);
        creditCard.decreaseLimit(500);
        double expected = 1000;
        double current = creditCard.getLimit();
        printResult(current != expected, "decreaseLimitTestFailed");
    }

    public void decreaseLimitAmountCheckTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setLimit(1500);
        creditCard.decreaseLimitAmountCheck(500);
        double expected = 1000;
        double current = creditCard.getLimit();
        printResult(current == expected, "decreaseLimitAmountCheckTestSucceed");
    }

    public void decreaseLimitAmountCheckTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setLimit(1500);
        creditCard.decreaseLimitAmountCheck(-500);
        double expected = 1000;
        double current = creditCard.getLimit();
        printResult(current != expected, "decreaseLimitAmountCheckTestFailed");
    }

    public void checkPinTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        boolean expected = true;
        boolean current = creditCard.checkPin(1234);
        printResult(current == expected, "checkPinTestSucceed");
    }

    public void checkPinTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        boolean expected = false;
        boolean current = creditCard.checkPin(4321);
        printResult(current == expected, "checkPinTestFailed");
    }

    public void checkAmountTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        boolean expected = true;
        boolean current = creditCard.checkAmount(1000);
        printResult(current == expected, "checkAmountTestSucceed");
    }

    public void checkAmountTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        boolean expected = false;
        boolean current = creditCard.checkAmount(-1000);
        printResult(current == expected, "checkAmountTestFailed");
    }

    public void checkDebtTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setDebt(1000);
        boolean expected = true;
        boolean current = creditCard.hasDebt();
        printResult(current == expected, "checkDebtTestSucceed");
    }

    public void checkDebtTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        boolean expected = false;
        boolean current = creditCard.hasDebt();
        printResult(current == expected, "checkDebtTestFailed");
    }

    public void cashDepositTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.cashDeposit(500);
        double expected = 500;
        double current = creditCard.getBalance();
        printResult(current == expected, "cashDepositTestSucceed");
    }

    public void cashDepositTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.cashDeposit(1000);
        double expected = 500;
        double current = creditCard.getBalance();
        printResult(current != expected, "cashDepositTestFailed");
    }

    public void debtRepayTestSucceed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setDebt(1000);
        creditCard.debtRepay(0);
        double expected = 0;
        double current = creditCard.getDebt();
        printResult(current == expected, "debtRepayTestSucceed");
    }

    public void debtRepayTestFailed() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.setDebt(1000);
        creditCard.debtRepay(0);
        double expected = 500;
        double current = creditCard.getDebt();
        printResult(current != expected, "debtRepayTestFailed");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
            succeedTests++;
        } else {
            System.out.println(test + " test FAILED");
            failedTests++;
        }
        System.out.println("----------------------------------------------------------");
    }

    public void printStat() {
        System.out.println(succeedTests + " tests SUCCEED.");
        System.out.println(failedTests + " tests FAILED.");
    }

}
