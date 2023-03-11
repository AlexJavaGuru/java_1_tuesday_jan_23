package student_romualds_leitans.lesson_7.lesson_6;

public class CreditCard {

    private String cardnumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(String cardnumber, int pinCode, double creditLimit) {
        this.cardnumber = cardnumber;
        this.pinCode = pinCode;
        this.creditLimit = creditLimit;
        this.balance = 0;
        this.debt = 0;
    }

    public void deposit(int pinCode, double amount) {
        if (this.pinCode != pinCode) {
            System.out.println("Incorrect Pin code");
        } else if (debt > 0 && amount < debt) {
            debt -= amount;
        } else if (debt > 0 && amount > debt) {
            balance = balance + (amount - debt);
            debt = 0;
        } else if (debt == 0) {
            balance += amount;
        }
    }

    public void withdraw(int pinCode, double amount) {
        if (this.pinCode != pinCode) {
            System.out.println("Incorrect Pin code");
        } else if (amount > creditLimit + balance) {
            System.out.println("Credit limit exceeded!");
        } else if (amount <= balance) {
            balance -= amount;
        } else if (creditLimit > balance + amount) {
            amount -= balance;
            debt += amount;
            balance = 0;
        }
    }


    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
    public double getDebt(){
        return debt;
    }

    public double setDebt(int debt) {
        return debt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
