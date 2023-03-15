package student_natalja_semitseva.NS_Lesson_7_Level6;


import java.util.Scanner;

public class CreditCard {
    private int cardNumber;
    private int pinCodeOfTheCard;
    private double balance;
    private int creditLimit;
    private double loanDebts;

     private void card(int cardNumber, int pinCodeOfTheCard) {
        this.creditLimit = 0;
        this.pinCodeOfTheCard = 1234;
        this.cardNumber = cardNumber;
        this.balance = 0;
        this.loanDebts = 0;

    }

    public double getCardNumber() {
         double cardNumber = 111222333;
      return cardNumber;

    }

    public int getPinCodeOfTheCard(int pinCodeOfTheCard) {
         int pin=1234;
        return pinCodeOfTheCard;
    }


    public double getBalance() {
         double balance =0;
        return balance;
    }

    public double getLoanDebts() {
         double loanDebts=0;
        return loanDebts;
    }
    public int setCreditLimit(int limit) {
        creditLimit = 0;
        return creditLimit;

    }

    public void deposit(double amount) {
        balance = balance + amount;

    }
   public boolean cardsIdentification(int cardNumber, int pin) {
        return false;





    }
    public double withdraw(boolean cardsIdentification,int amount){
         if (cardsIdentification) {
            if (balance > 0 && amount <= balance) {
                balance = balance - creditLimit;

                balance -= amount;
                if (balance < amount) ;
                creditLimit -= amount;
                loanDebts = balance - creditLimit;
            }
        }
        if (loanDebts > creditLimit) {

            System.out.println("Transaction  cancelled due to exceeding the limit");
        }
            return 0;

    }

    public int pinCodeOfTheCard() {

        int count = 0;
        while (count < 3) {
            count++;

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter Pin Code: ");
            int pin = keyboard.nextInt();

            if (pin == 1234) {
                System.out.println("Welcome!");
                break;

            } else {
                System.out.println("Password is incorrect!Try again! ");
            }

            if (count == 3) {
                System.out.println("Yor Account is locked for further 24 hours");
            }
        }
        return count;
    }

}

