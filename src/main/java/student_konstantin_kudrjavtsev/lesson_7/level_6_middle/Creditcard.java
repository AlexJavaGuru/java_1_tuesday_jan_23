package student_konstantin_kudrjavtsev.lesson_7.level_6_middle;

class CreditCard {

    final String numberCard;
    final String pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    CreditCard(String numberCard, String pinCode) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }

    //  позволяет установить кредитный лимит после создания карты.
    private void setCreditLimit(double limit) {

        this.creditLimit = limit;
    }

    //  метод зачисления денег
    public boolean setCreditingFundsToTheCard(String pin, double amount) {
        if (!pin.equals(pinCode)) {
            return false;
        }

        if (loanDebt > 0) {
            if (amount >= loanDebt) {
                balance += (amount - loanDebt);
                loanDebt = 0;
            } else {
                loanDebt -= amount;
            }
        } else {
            balance += amount;
        }

        return true;
    }

    //  метод снятие денег
    public boolean withdrawalOfFundsFromTheCard(String pin, double amount) {
        if (!pin.equals(pinCode)) {
            return false;
        }

        double availableFunds = balance + loanDebt;
        if (amount > availableFunds) {
            return false;
        }

        if (balance >= amount) {
            balance -= amount;
        } else {
            loanDebt = loanDebt - (amount - balance);
            balance = 0;
        }

        return true;
    }

    String getNumberCard() {
        return numberCard;
    }
    String getPinCode() {
        return pinCode;
    }
    double getBalance() {
        return balance;
    }
    double getCreditLimit() {
        return  creditLimit;
    }
    double getLoanDebt() {
        return loanDebt;
    }
}