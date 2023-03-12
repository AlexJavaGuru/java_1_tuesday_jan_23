package student_oksana_tarasova.lesson_7.level_6;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.depositAmountTest();
        test.depositTest1();
        test.depositAmountTest2();
        test.depositAmountTest3();
        test.depositAmountTest4();
        test.depositAmountTest5();
        test.depositAmountTest6();
        test.depositAmountTest7();
        test.withdrawTest();
        test.withdrawTest1();
        test.withdrawTest2();
        test.withdrawTest3();
        test.withdrawTest4();
    }

    public void depositAmountTest() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 0.0);
        creditTest.deposit(3455, 1000.0);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 1000.0;
        check(expectedBalanceResult == realResult, "deposit amount");
    }

    public void depositTest1() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 0.0);
        creditTest.deposit(3555, 1000.0);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 0.0;
        check(expectedBalanceResult == realResult, " Wrong pin code");
    }

    public void depositAmountTest2() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1400);
        creditTest.deposit(3455, 400.0);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 0.0;
        check(expectedBalanceResult == realResult, "Depositing funds, less loan debt / balance 0.0");
    }

    public void depositAmountTest3() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1400.0);
        double realResult = creditTest.getLoanDebt();
        double expectedLoanDept = 400.0;
        check(expectedLoanDept == realResult, "Increase in debt / loan 400.0");
    }

    public void depositAmountTest4() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1400.0);
        creditTest.deposit(3455, 401.0);
        double realResult = creditTest.getLoanDebt();
        double expectedLoanDept = 0.0;
        check(expectedLoanDept == realResult, "Increase in debt / loan 0.0");
    }

    public void depositAmountTest5() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1400.0);
        double realResult = creditTest.getCreditLimit();
        double expectedBalanceResult = 100.0;
        check(expectedBalanceResult == realResult, "Loan debt repayment / credit 100.0");
    }

    public void depositAmountTest6() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1400.0);
        creditTest.deposit(3455, 401.0);
        double realResult = creditTest.getCreditLimit();
        double expectedBalanceResult = 500.0;
        check(expectedBalanceResult == realResult, "Loan debt repayment / credit 500.0");
    }

    public void depositAmountTest7() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1400.0);
        creditTest.deposit(3455, 3000.);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 2600.0;
        check(expectedBalanceResult == realResult, "Increase in balance after debt repayment");
    }

    public void withdrawTest() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 500.0);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 500.0;
        check(expectedBalanceResult == realResult, "Withdraw cash from balance");
    }

    public void withdrawTest1() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3555, 500.0);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 1000.0;
        check(expectedBalanceResult == realResult, "Wrong pin code");
    }

    public void withdrawTest2() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 2000.0);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 1000.0;
        check(expectedBalanceResult == realResult, "Withdrawn money more than balance and credit");
    }

    public void withdrawTest3() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1100.0);
        double realResult = creditTest.getBalanceCard();
        double expectedBalanceResult = 0.0;
        check(expectedBalanceResult == realResult, "Withdrawn money more than balance/0.0");
    }

    public void withdrawTest4() {
        CreditCard creditTest = new CreditCard(123456789, 3455, 500.0);
        creditTest.deposit(3455, 1000.0);
        creditTest.withdraw(3455, 1100.0);
        double realResult = creditTest.getLoanDebt();
        double expectedBalanceResult = 100.0;
        check(expectedBalanceResult == realResult, "Withdrawn money more than balance/ loanDraw ++");
    }

    public void check(boolean stateInt, String nameTest) {
        if (stateInt) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = false");
        }
    }
}






