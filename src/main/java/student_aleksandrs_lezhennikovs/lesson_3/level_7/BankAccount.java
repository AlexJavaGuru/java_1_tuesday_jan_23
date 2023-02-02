package student_aleksandrs_lezhennikovs.lesson_3.level_7;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return owner;
    }

    int getMoney() {
        return money;
    }

}
