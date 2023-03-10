package student_daniels_belejuns.lesson_7.level_6.task_10;

public class CreditCard {
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

    public void deposit(double amount, boolean authentication) {
        this.balance += amount;
    }

    public boolean withdraw(double amount, boolean authentication) {
        if (amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit += creditLimit;
        balance += creditLimit;
    }

    public boolean authentication(long cardNumber, int pinCode) {
        return (this.cardNumber == cardNumber && this.pinCode == pinCode);
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

}
