package student_nikita_visnakovs.lesson_7.level_6;

public class CreditCard {

    private Long cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    public CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        balance = 0;
        creditDebt = 0;
    }

    public void deposit(int pinCode, double amount) {
        if (this.pinCode != pinCode) {
            System.out.println("Pin code is not correct...");
        } else if (creditDebt > 0 && amount >= creditDebt) {
            balance += amount - creditDebt;
            creditDebt = 0;
        } else if (creditDebt > 0) {
            creditDebt -= amount;
        } else if (creditDebt == 0) {
            balance += amount;
        }
    }
    public void withdraw (int pinCode, int amountToWithdraw) {
        if (this.pinCode != pinCode) {
            System.out.println("Pic code is not correct...");
        } else if (amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        } else if (amountToWithdraw <= balance + creditLimit) {
            amountToWithdraw -= balance;
            balance = 0;
            creditDebt += amountToWithdraw;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
