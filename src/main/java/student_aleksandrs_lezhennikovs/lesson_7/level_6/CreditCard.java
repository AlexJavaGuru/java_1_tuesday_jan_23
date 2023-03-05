package student_aleksandrs_lezhennikovs.lesson_7.level_6;

class CreditCard {

    private long cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int creditDebt;


    CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        balance = 0;
        creditLimit = 0;
        creditDebt = 0;
    }

    void setCreditLimit(int creditLimit) {
        this.creditLimit += creditLimit;
        balance += creditLimit;
    }

    long getCardNumber() {
        return cardNumber;
    }

    int getCreditLimit() {
        return creditLimit;
    }

    int getBalance() {
        return balance;
    }

    int getCreditDebt() {
        return creditDebt;
    }

    void deposit(int amount, boolean authentication) {
        if (authentication) {
            balance += amount;
            updateCreditDebtAfterDeposit(amount);
        }
    }

    void updateCreditDebtAfterDeposit(int amount) {
        if (creditDebt < 0) {
            creditDebt += amount;
            if (creditDebt > 0) {
                creditDebt = 0;
            }
        }
    }

    void withdraw(int amount, boolean authentication) {
        if (isAmountGrateThanZero(amount)) {
            if (authentication) {
                calculateBalanceAfterWithdraw(amount);
                updateCreditDebtAfterWithdraw();
            }
        }
    }

    boolean isAmountGrateThanZero(int amount) {
        return amount > 0;
    }

    boolean authentication(long cardNumber, int pinCode) {
        return (this.cardNumber == cardNumber && this.pinCode == pinCode);
    }

    void calculateBalanceAfterWithdraw(int amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    void updateCreditDebtAfterWithdraw() {
        if (balance < creditLimit) {
            creditDebt = balance - creditLimit;
        }
    }

}