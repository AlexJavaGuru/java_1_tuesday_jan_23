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

    private void proceedDepositAmountCheck(double amount) {
        if (checkAmount(amount)) {
            proceedDepositDebtCheck(amount);
        } else {
            rejectOperation("Amount is incorrect");
        }
    }

    private void proceedDepositDebtCheck(double amount) {
        if (checkDebt()) {
            cashDeposit(amount);
        } else {
            cashDeposit(debtRepay(amount));
        }
    }

    public void withdraw(int pin, double amount) {
        if (checkPin(pin)) {
            proceedWithdrawAmountCheck(amount);
        } else {
            rejectOperation("Pin is incorrect");
        }
    }

    private void proceedWithdrawAmountCheck(double amount) {
        if (checkAmount(amount)) {
            proceedWithdrawFromBalance(amount);
        } else {
            rejectOperation("Amount is incorrect");
        }
    }

    private void proceedWithdrawFromBalance(double amount) {
        double balanceAfterWithdrawing = balance - amount;

        if (balanceAfterWithdrawing >= 0) {
            setBalance(balanceAfterWithdrawing);
        } else {
            setBalance(0);
            proceedWithdrawFromCreditLimit(Math.abs(balanceAfterWithdrawing));
        }
    }

    private void proceedWithdrawFromCreditLimit(double amount) {
        double debtAfterWithdraw = debt + amount;
        if (debtAfterWithdraw <= limit) {
            setDebt(debtAfterWithdraw);
        } else {
            rejectOperation("You cannot withdraw more than credit limit.");
        }
    }

    public void increaseLimit(double amount) {
        if (checkAmount(amount)) {
            limit += amount;
        } else {
            rejectOperation("Amount is incorrect");
        }
    }

    public void decreaseLimit(double amount) {
        if (checkDebt()) {
            decreaseLimitAmountCheck(amount);
        } else {
            rejectOperation("Please repay debt first.");
        }
    }

    private void decreaseLimitAmountCheck(double amount) {
        if (checkDebt() && checkAmount(amount)) {
            limit -= amount;
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

    public boolean checkDebt() {
        return debt <= 0;
    }

    private void cashDeposit(double amount) {
        setBalance(balance += amount);
    }

    private double debtRepay(double amount) {
        double debtAfterRepay = debt - amount;

        if (debtAfterRepay >= 0) {
            setDebt(debtAfterRepay);
        } else {
            setDebt(0);
            setBalance(0);
        }

        return debtAfterRepay * -1;
    }

    private void rejectOperation(String rejectMessage) {
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
        this.limit = limit;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}
