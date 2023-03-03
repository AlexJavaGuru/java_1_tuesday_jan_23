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

    public void setCreditLimit(int creditLimit) {
        this.creditLimit += creditLimit;
        balance += creditLimit;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public boolean authentication(long cardNumber, int pinCode) {
        return (this.cardNumber == cardNumber && this.pinCode == pinCode);
    }

    public void withdraw(int amount, boolean authentication) {
        if (authentication) {
            if (balance > 0 && amount <= balance) {
                balance -= amount;
                updateCreditDebtAfterCredit();
            }
        }
    }

    public void updateCreditDebtAfterCredit() {
        if (balance < creditLimit) {
            creditDebt = balance - creditLimit;
        }
    }

    public void updateCreditDebtAfterDeposit(int amount) {
        if (creditDebt < 0) {
            creditDebt += amount;
            if (creditDebt > 0) {
                creditDebt = 0;
            }
        }
    }

    public void deposit(int amount, boolean authentication) {
        if (authentication) {
            balance += amount;
            updateCreditDebtAfterDeposit(amount);
        }
    }
}