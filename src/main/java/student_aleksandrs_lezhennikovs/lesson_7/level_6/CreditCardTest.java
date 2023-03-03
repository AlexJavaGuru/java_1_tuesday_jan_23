package student_aleksandrs_lezhennikovs.lesson_7.level_6;


class CreditCardTest {
    public static void main(String[] args) {
        checkTrueAuthentication();
        checkFailAuthentication();
        checkDeposit();
        checkWithdraw();
        checkCardLimit();
    }

    public static void checkTrueAuthentication() {
        CreditCard creditCard = new CreditCard(2040_0500_4577_7997L, 7777);
        boolean expectedResult = true;
        boolean calculatedResult = creditCard.authentication(2040_0500_4577_7997L, 7777);
        check("Authentication", expectedResult, calculatedResult);
    }

    public static void checkFailAuthentication() {
        CreditCard creditCard = new CreditCard(2040_0500_4577_7997L, 7777);
        boolean expectedResult = false;
        boolean calculatedResult = creditCard.authentication(2040_0500_4577_7997L, 0000);
        check("Authentication fail", expectedResult, calculatedResult);
    }

    public static void check(String actionName, boolean expect, boolean actual) {
        if (expect == actual) {
            System.out.println(actionName + " test PASSED");
        } else {
            System.out.println(actionName + " test FAILED");
        }
    }

    public static void check(String actionName, int expect, int actual) {
        if (expect == actual) {
            System.out.println(actionName + " test PASSED");
        } else {
            System.out.println(actionName + " test FAILED");
        }
    }

    public static void checkDeposit() {
        CreditCard creditCard = new CreditCard(2040_0500_4577_7997L, 7777);
        boolean authentication = creditCard.authentication(2040_0500_4577_7997L, 7777);
        int expectedResult = 150;
        creditCard.deposit(150, authentication);
        int calculatedResult = creditCard.getBalance();
        check("Deposit", expectedResult, calculatedResult);
    }

    public static void checkWithdraw() {
        CreditCard creditCard = new CreditCard(2040_0500_4577_7997L, 7777);
        boolean authentication = creditCard.authentication(2040_0500_4577_7997L, 7777);
        creditCard.deposit(150, authentication);
        creditCard.withdraw(100, authentication);
        int expectedResult = 50;
        int calculatedResult = creditCard.getBalance();
        check("Withdraw", expectedResult, calculatedResult);
    }

    public static void checkCardLimit() {
        CreditCard creditCard = new CreditCard(2040_0500_4577_7997L, 7777);
        creditCard.setCreditLimit(2500);
        int expectedResult = 2500;
        int calculatedResult = creditCard.getCreditLimit();
        check("Credit limit", expectedResult, calculatedResult);
    }

}
