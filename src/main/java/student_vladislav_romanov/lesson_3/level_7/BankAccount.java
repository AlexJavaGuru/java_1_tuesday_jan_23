package student_vladislav_romanov.lesson_3.level_7;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
