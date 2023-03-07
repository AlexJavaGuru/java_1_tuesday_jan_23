package student_vladislav_romanov.lesson_7.level_6;

class CreditCard {

    private String number;
    private int pin;
    private double balance;
    private double limit;
    private double debt;

    CreditCard(String number, int pin) {
        this.number = number;
        this.pin = pin;
        balance = 0;
        limit = 0;
        debt = 0;
    }

    public void deposit(int pin, double amount) {
        if (checkPin(pin)) {
            proceedDepositAmountCheck(amount);
        } else {
            rejectOperation("Pin is incorrect");
        }
    }

    public void proceedDepositAmountCheck(double amount) {
        if (checkAmount(amount)) {
            proceedDepositDebtCheck(amount);
        } else {
            rejectOperation("Amount is incorrect");
        }
    }

    public void proceedDepositDebtCheck(double amount) {
        if (hasDebt()) {
            cashDeposit(debtRepay(debt - amount));
        } else {
            cashDeposit(amount);
        }
    }

    public void withdraw(int pin, double amount) {
        if (checkPin(pin)) {
            proceedWithdrawAmountCheck(amount);
        } else {
            rejectOperation("Pin is incorrect");
        }
    }

    public void proceedWithdrawAmountCheck(double amount) {
        if (checkAmount(amount)) {
            proceedWithdrawFromBalance(balance - limit - amount);
        } else {
            rejectOperation("Amount is incorrect");
        }
    }

    public void proceedWithdrawFromBalance(double pureBalanceAfterWithdrawing) {
        if (pureBalanceAfterWithdrawing >= 0) {
            setBalance(pureBalanceAfterWithdrawing + limit);
        } else {
            proceedWithdrawFromCreditLimit(Math.abs(pureBalanceAfterWithdrawing) + debt);
        }
    }

    public void proceedWithdrawFromCreditLimit(double debtAfterWithdraw) {
        if (debtAfterWithdraw <= limit) {
            setBalance(debtAfterWithdraw - debt);
            setDebt(debtAfterWithdraw);
        } else {
            rejectOperation("You cannot withdraw more than credit limit.");
        }
    }

    public void increaseLimit(double amount) {
        if (checkAmount(amount)) {
            setLimit(limit + amount);
        } else {
            rejectOperation("Amount is incorrect");
        }
    }

    public void decreaseLimit(double amount) {
        if (hasDebt()) {
            rejectOperation("Please repay debt first.");
        } else {
            decreaseLimitAmountCheck(amount);
        }
    }

    public void decreaseLimitAmountCheck(double amount) {
        if (checkAmount(amount)) {
            setLimit(limit - amount);
        } else {
            rejectOperation("Please repay debt first.");
        }
    }

    public boolean checkPin(int pin) {
        return getPin() == pin;
    }

    public boolean checkAmount(double amount) {
        return amount > 0;
    }

    public boolean hasDebt() {
        return debt > 0;
    }

    public void cashDeposit(double amount) {
        setBalance(balance + amount);
    }

    public double debtRepay(double debtAfterRepay) {
        if (debtAfterRepay >= 0) {
            setDebt(debtAfterRepay);
        } else {
            setDebt(0);
            setBalance(0);
        }

        return debtAfterRepay * -1;
    }

    public void rejectOperation(String rejectMessage) {
        System.out.println("Operation rejected. " + rejectMessage);
    }

    public void printCardInfo() {
        System.out.println(number + " | " + pin + " | " + balance + " | " + limit + " | " + debt);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        balance = balance - this.limit + limit;
        this.limit = limit;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}
