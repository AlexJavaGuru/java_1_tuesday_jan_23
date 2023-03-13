package student_anastasiia_bokareva.lesson3.level7;

public class BankAccount {
    String owner;
    int money;

    public BankAccount (String ownerName, int moneyAmount) {
        this.owner = ownerName;
        this.money = moneyAmount;
    }

    String getOwner() {
        return owner;
    }

    int  getMoney() {
        return money;
    }
}
