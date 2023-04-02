package student_julija_raudive.lesson_7.level_6;

class CreditCardTest {

    CreditCard card = new CreditCard("374245455400126", 111);

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.depositWhenNoLoanDebtTest();
        test.depositWhenLoanDebtIsEqualToDepositSumTest();
        test.depositWhenLoanDebtIsLessThanDepositSumTest();
        test.depositWhenLoanDebtIsMoreThanDepositSumTest();
        test.withdrawWhenBalanceIsOkTest();
        test.withdrawWhenBalanceIsLessTest();
        test.withdrawWhenLimitIsExceeded();
        test.depositWhenPinIsIncorrect();
        test.withdrawWhenPinIsIncorrect();




    }

    public void depositWhenNoLoanDebtTest() {
        card.deposit(111, 10);
        double resultBalance = 10;
        double resultLoanDebt = 0;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Deposit when no loan debt");

    }

    public void depositWhenLoanDebtIsEqualToDepositSumTest() {
        card.withdraw(111, 20);
        card.deposit(111, card.getLoanDebt());
        double resultBalance = 0;
        double resultLoanDebt = 0;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Deposit sum equals to loan debt");

    }

    public void depositWhenLoanDebtIsLessThanDepositSumTest() {
        card.withdraw(111, 15);
        card.deposit(111, card.getLoanDebt()+8.54);
        double resultBalance = 8.54;
        double resultLoanDebt = 0;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Deposit sum is more than loan debt");

    }

    public void depositWhenLoanDebtIsMoreThanDepositSumTest() {
        card.withdraw(111, 35);
        double sumToDeposit = card.getLoanDebt()-1;
        card.deposit(111, sumToDeposit);
        double resultBalance = 0;
        double resultLoanDebt = 1;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Deposit sum is less than loan debt");

    }

    public void withdrawWhenBalanceIsOkTest(){
        card.deposit(111, 100.6);
        card.withdraw(111, 50.78);
        double resultBalance = 48.82;
        double resultLoanDebt = 0;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Withdraw when balance is OK");
    }

    public void withdrawWhenBalanceIsLessTest(){
        card.withdraw(111, 48.83);
        double resultBalance = 0;
        double resultLoanDebt = 0.01;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Withdraw when balance is less");
    }

    public void withdrawWhenLimitIsExceeded(){
        card.withdraw(111, 200.7);
        double resultBalance = 0;
        double resultLoanDebt = 0.01;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Withdraw when credit limit is exceeded");
    }

    public void depositWhenPinIsIncorrect(){
        card.deposit(112, 60);
        double resultBalance = 0;
        double resultLoanDebt = 0.01;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Deposit when PIN is incorrect");
    }

    public void withdrawWhenPinIsIncorrect(){
        card.withdraw(109, 60);
        double resultBalance = 0;
        double resultLoanDebt = 0.01;
        checkResults((card.getBalance() == resultBalance && card.getLoanDebt() == resultLoanDebt), "Withdraw when PIN is incorrect");
    }



    void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }


}
