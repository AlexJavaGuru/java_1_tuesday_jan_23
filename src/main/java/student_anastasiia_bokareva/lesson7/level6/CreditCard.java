package student_anastasiia_bokareva.lesson7.level6;

import java.util.Scanner;

public class CreditCard {
    int cardNumber;
    int pin;

    public CreditCard(int userCardNumber,int userPin){
        this.cardNumber = userCardNumber;
        this.pin = userPin;
    }

    public int deposit (){
        CreditCard card = new CreditCard(56, 000);
        int checkPin = card.checkPincode();
        boolean check = card.check(card.pin,checkPin);
        int money = card.depositMoney(check);
        return money;
    }

    public int checkPincode (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your pin - ");
        int checkPin = scan.nextInt();
        return  checkPin;
    }

    public boolean check (int realResult, int expectedResult){
        boolean correct = false;
        if (realResult==expectedResult){
            System.out.print("Pin is correct!");
            correct=true;
        } else {
            System.out.println("Wrong Pin! Dicline");
        }
        return correct;
    }
    public int depositMoney (boolean check){
        Scanner scan = new Scanner(System.in);
        int money =0;
        if (check==true){
            System.out.print("Please enter the number of money you would like to deposit - ");
            money = scan.nextInt();
        }
        return money;
    }



    public int withdraw(int balance){
        CreditCard card = new CreditCard(56,000);
        int checkPin = card.checkPincode();
        boolean check = card.check(card.pin,checkPin);
        int money = card.withDrawMoney(check);
        balance = card.balanceAdditional(money,balance);
        return balance;

    }

    public int withDrawMoney (boolean check){
        Scanner scan = new Scanner(System.in);
        int money =0;
        if (check==true){
            System.out.print("Please enter the sum you would like to with draw- ");
            money = scan.nextInt();
        }
        return money;
    }
    public int balanceAdditional (int money, int balance){
        if (balance<money){
            System.out.println("Not enough money on your card");
        } else {
            balance=balance-money;
            System.out.println("The operation was success! Now your balance is - "+ balance);
        }
        return balance;
    }

}
