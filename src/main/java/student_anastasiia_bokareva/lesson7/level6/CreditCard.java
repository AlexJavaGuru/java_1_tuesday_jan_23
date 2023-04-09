package student_anastasiia_bokareva.lesson7.level6;

import javax.print.DocFlavor;
import java.util.Scanner;

public class CreditCard {
    int cardNumber;
    int pin;
    int balance ;
    int creditLimit;
    int debt;

    public CreditCard(int userCardNumber,int userPin,int creditLimit){
        this.cardNumber = userCardNumber;
        this.pin = userPin;
        this.balance =0;
        this.creditLimit=creditLimit;
        this.debt=0;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getDebt() {
        return debt;
    }

    public int deposit (int checkPin, int amountOfMoneyToDepose){;
        boolean check = check(pin,checkPin);
        int money = 0;
        if (check==true) {
            money = depositMoney(amountOfMoneyToDepose);
        }
        return money;
    }

    public boolean check (int realResult, int expectedResult){
        if (realResult==expectedResult){
            System.out.print("Pin is correct!");
            return true;
        } else {
            System.out.println("Wrong Pin! Dicline");
        }
        return false;
    }
    public int depositMoney (int amountOfMoney){
        balance=balance+money(amountOfMoney);
        return balance;
    }

    int money (int amountOfMoney){
        if (debt>amountOfMoney){
            debt=debt-amountOfMoney;
            amountOfMoney=0;
        } else {
            amountOfMoney=amountOfMoney-debt;
        }
        return amountOfMoney;
    }



    public void withdraw (int checkPin, int moneyTaken){
        boolean check = check(pin,checkPin);
        if (check==true) {
            debt=debt(moneyTaken);
            balance = balance(moneyTaken);
        }
    }

    int debt (int money) {
        if ((balance-money)<0) {
            debt = debt - (balance-money);
        }
        return debt;
    }

    int balance (int money){
        if (balance < money){
            balance =0;
        } else {
            balance=balance-money;
        }
        return balance;
    }


}
